package com.monitora.estagio.ceara.app;

import com.monitora.estagio.ceara.utils.datareader.DataFileReaderImpl;


public class App {

    public static void main(String[] args) {
        DataFileReaderImpl.readerFilesCsv("src/main/java/com/monitora/estagio/ceara/resources/csv/2021.csv");
        //MainScreen.start();
    }
}
