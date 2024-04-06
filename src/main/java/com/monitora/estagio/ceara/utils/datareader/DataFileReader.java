package com.monitora.estagio.ceara.utils.datareader;

import com.monitora.estagio.ceara.utils.dto.GovernmentAgencyDTO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;

public class DataFileReader implements Runnable {

    private List<GovernmentAgencyDTO> govAgencyList;
    private String path;
    private ConverterLineToDTO newDTO;
    private CountDownLatch latch;

    public DataFileReader(String path, CountDownLatch latch) {
        this.govAgencyList = new ArrayList<>();
        this.path = path;
        this.newDTO = (String line) ->  {
            String[] fields = line.split(",");
            return new GovernmentAgencyDTO(
                    fields[0], fields[1],fields[2],fields[3],fields[4],fields[5],
                    fields[6],fields[7], fields[8],fields[9],fields[10]);
        };
        this.latch = latch;
    }

    public List<GovernmentAgencyDTO> getGovAgencyList() {
        return govAgencyList;
    }

    @Override
    public void run() {
        long inicio = System.currentTimeMillis();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            this.govAgencyList = br.lines()
                    .skip(1)
                    .map(newDTO::run)
                    .collect(Collectors.toList());
            // Sinaliza que esta thread terminou de executar
            latch.countDown();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long fim = System.currentTimeMillis();
        System.out.println("thread - " + path + ": "+ (fim - inicio));
    }
}
