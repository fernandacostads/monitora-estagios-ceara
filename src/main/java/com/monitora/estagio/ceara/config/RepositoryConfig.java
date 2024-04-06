package com.monitora.estagio.ceara.config;

import com.monitora.estagio.ceara.repository.GovernmentAgencyRepository;
import com.monitora.estagio.ceara.utils.datareader.TaskDataFileReader;
import com.monitora.estagio.ceara.utils.dto.GovernmentAgencyDTO;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class RepositoryConfig {

    private static Map<String, List<GovernmentAgencyDTO>> mapByAgencyDTO;

    public static GovernmentAgencyRepository config() {
        CountDownLatch latch = new CountDownLatch(4);

        TaskDataFileReader taskFileReader2021 = new TaskDataFileReader("src/main/java/com/monitora/estagio/ceara/resources/csv/2021.csv", latch);
        TaskDataFileReader taskFileReader2022 = new TaskDataFileReader("src/main/java/com/monitora/estagio/ceara/resources/csv/2022.csv", latch);
        TaskDataFileReader taskFileReader2023 = new TaskDataFileReader("src/main/java/com/monitora/estagio/ceara/resources/csv/2023.csv", latch);
        TaskDataFileReader taskFileReader2024 = new TaskDataFileReader("src/main/java/com/monitora/estagio/ceara/resources/csv/2024.csv", latch);

        Thread reader2021 = new Thread(taskFileReader2021);
        Thread reader2022 = new Thread(taskFileReader2022);
        Thread reader2023 = new Thread(taskFileReader2023);
        Thread reader2024 = new Thread(taskFileReader2024);

        long inicio = System.currentTimeMillis();
        reader2021.start();
        reader2022.start();
        reader2023.start();
        reader2024.start();

        //Aguardando todas as threads terminarem
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Obtendo as listas preenchidas
        List<GovernmentAgencyDTO> list2021 = taskFileReader2021.getGovAgencyList();
        List<GovernmentAgencyDTO> list2022 = taskFileReader2022.getGovAgencyList();
        List<GovernmentAgencyDTO> list2023 = taskFileReader2023.getGovAgencyList();
        List<GovernmentAgencyDTO> list2024 = taskFileReader2024.getGovAgencyList();

        //agrupa as listas em um novo fluxo
        mapByAgencyDTO = Stream.of(list2021, list2022, list2023, list2024)
                        //transforma o fluxo de listas em um único fluxo de GovernmentAgencyDTO
                        //List::stream é a função que chama o stream() para cada lista
                        .flatMap(List::stream)
                        //agrupa os GovernmentAgencyDTO por agency
                        .collect(Collectors.groupingBy(GovernmentAgencyDTO::agency));

        long fim = System.currentTimeMillis();
        System.out.println("esperando threads:" + (fim - inicio));

        return new GovernmentAgencyRepository(mapByAgencyDTO);
    }

    public static Map<String, List<GovernmentAgencyDTO>> getMapByAgencyDTO() {
        return Collections.unmodifiableMap(mapByAgencyDTO);
    }
}
