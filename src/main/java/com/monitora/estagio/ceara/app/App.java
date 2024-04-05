package com.monitora.estagio.ceara.app;


import com.monitora.estagio.ceara.repository.GovernmentAgencyRepository;
import com.monitora.estagio.ceara.utils.datareader.DataFileReaderImpl;

public class App {

    public static void main(String[] args) {
        GovernmentAgencyRepository governmentAgencyRepository = new GovernmentAgencyRepository(
                DataFileReaderImpl.readerFilesCsv("src/main/java/com/monitora/estagio/ceara/resources/csv/2021.csv"),
        DataFileReaderImpl.readerFilesCsv("src/main/java/com/monitora/estagio/ceara/resources/csv/2022.csv"),
        DataFileReaderImpl.readerFilesCsv("src/main/java/com/monitora/estagio/ceara/resources/csv/2023.csv"),
        DataFileReaderImpl.readerFilesCsv("src/main/java/com/monitora/estagio/ceara/resources/csv/2024.csv")
        );
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
