package com.monitora.estagio.ceara.app;


import com.monitora.estagio.ceara.config.ConfigRepository;
import com.monitora.estagio.ceara.repository.GovernmentAgencyRepository;

public class App {

    public static void main(String[] args) {
        GovernmentAgencyRepository governmentAgencyRepository = ConfigRepository.config();

//        System.out.println(governmentAgencyRepository.getList2021().getFirst());
//        System.out.println(governmentAgencyRepository.getList2021().getLast());
//        System.out.println(governmentAgencyRepository.getList2022().getFirst());
//        System.out.println(governmentAgencyRepository.getList2022().getLast());
//        System.out.println(governmentAgencyRepository.getList2023().getFirst());
//        System.out.println(governmentAgencyRepository.getList2023().getLast());
//        System.out.println(governmentAgencyRepository.getList2024().getFirst());
//        System.out.println(governmentAgencyRepository.getList2024().getLast());
        //MainScreen.start();
    }
}
