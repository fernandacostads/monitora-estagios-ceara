package com.monitora.estagio.ceara.app;


import com.monitora.estagio.ceara.config.RepositoryConfig;
import com.monitora.estagio.ceara.config.MainScreenConfig;
import com.monitora.estagio.ceara.repository.GovernmentAgencyRepository;
import com.monitora.estagio.ceara.view.MainScreen;

public class App {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        GovernmentAgencyRepository governmentAgencyRepository = RepositoryConfig.config();
        MainScreen mainScreen = MainScreenConfig.config();

        mainScreen.start();
        long fim = System.currentTimeMillis();
        System.out.println("programa:" + (fim - inicio));

        //governmentAgencyRepository.getMapByAgency().forEach((key, value) -> System.out.println(value));


//        System.out.println(governmentAgencyRepository.getList2021().getFirst());
//        System.out.println(governmentAgencyRepository.getList2021().getLast());
//        System.out.println(governmentAgencyRepository.getList2022().getFirst());
//        System.out.println(governmentAgencyRepository.getList2022().getLast());
//        System.out.println(governmentAgencyRepository.getList2023().getFirst());
//        System.out.println(governmentAgencyRepository.getList2023().getLast());
//        System.out.println(governmentAgencyRepository.getList2024().getFirst());
//        System.out.println(governmentAgencyRepository.getList2024().getLast());
    }
}
