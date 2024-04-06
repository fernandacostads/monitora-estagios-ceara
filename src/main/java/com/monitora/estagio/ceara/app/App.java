package com.monitora.estagio.ceara.app;


import com.monitora.estagio.ceara.config.MapConfig;
import com.monitora.estagio.ceara.config.MainScreenConfig;
import com.monitora.estagio.ceara.config.TaskRepositoryConfig;
import com.monitora.estagio.ceara.repository.GovernmentAgencyRepository;
import com.monitora.estagio.ceara.utils.dto.GovernmentAgencyDTO;
import com.monitora.estagio.ceara.view.MainScreen;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        Map<String, List<GovernmentAgencyDTO>> mapByAgencyDTO = MapConfig.config();
        TaskRepositoryConfig repositoryConfig = new TaskRepositoryConfig(mapByAgencyDTO);

        MainScreen mainScreen = MainScreenConfig.config();
        mainScreen.start();

        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<GovernmentAgencyRepository> repository = executorService.submit(repositoryConfig);



        long fim = System.currentTimeMillis();
        System.out.println("programa:" + (fim - inicio));


    }
}
