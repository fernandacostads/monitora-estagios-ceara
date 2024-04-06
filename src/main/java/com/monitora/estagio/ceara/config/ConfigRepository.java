package com.monitora.estagio.ceara.config;

import com.monitora.estagio.ceara.repository.GovernmentAgencyRepository;
import com.monitora.estagio.ceara.utils.datareader.DataFileReader;
import com.monitora.estagio.ceara.utils.dto.GovernmentAgencyDTO;

import java.util.List;
import java.util.concurrent.CountDownLatch;


public class ConfigRepository {

    public static GovernmentAgencyRepository config() {
        CountDownLatch latch = new CountDownLatch(4);

        DataFileReader reader2021 = new DataFileReader("src/main/java/com/monitora/estagio/ceara/resources/csv/2021.csv", latch);
        DataFileReader reader2022 = new DataFileReader("src/main/java/com/monitora/estagio/ceara/resources/csv/2022.csv", latch);
        DataFileReader reader2023 = new DataFileReader("src/main/java/com/monitora/estagio/ceara/resources/csv/2023.csv", latch);
        DataFileReader reader2024 = new DataFileReader("src/main/java/com/monitora/estagio/ceara/resources/csv/2024.csv", latch);

        Thread r2021 = new Thread(reader2021);
        Thread r2022 = new Thread(reader2022);
        Thread r2023 = new Thread(reader2023);
        Thread r2024 = new Thread(reader2024);

        long inicio = System.currentTimeMillis();
        r2021.start();
        r2022.start();
        r2023.start();
        r2024.start();

        //Aguardando todas as threads terminarem
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Obtendo as listas preenchidas
        List<GovernmentAgencyDTO> list2021 = reader2021.getGovAgencyList();
        List<GovernmentAgencyDTO> list2022 = reader2022.getGovAgencyList();
        List<GovernmentAgencyDTO> list2023 = reader2023.getGovAgencyList();
        List<GovernmentAgencyDTO> list2024 = reader2024.getGovAgencyList();

        long fim = System.currentTimeMillis();
        System.out.println("esperando threads:" + (fim - inicio));

//        System.out.println(list2021.size());
//        System.out.println(list2022.size());
//        System.out.println(list2023.size());
//        System.out.println(list2024.size());

        return new GovernmentAgencyRepository(list2021, list2022, list2023, list2024);
    }
}
