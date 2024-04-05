package com.monitora.estagio.ceara.utils.datareader;

import com.monitora.estagio.ceara.utils.dto.GovernmentAgencyDTO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataFileReaderImpl {
    public static List<GovernmentAgencyDTO> readerFilesCsv(String csv) {
        List<GovernmentAgencyDTO> govAgencyList = new ArrayList<>();
        DataFileReader newDTO = (String line) ->  {
            String[] fields = line.split(",");
            return new GovernmentAgencyDTO(
                    fields[0], fields[1],fields[2],fields[3],fields[4],fields[5],
                    fields[6],fields[7], fields[8],fields[9],fields[10]);
        };

        try (BufferedReader br = new BufferedReader(new FileReader(csv))) {
            govAgencyList = br.lines()
                    .skip(1)
                    .map(newDTO::newGovernmentAgencyDTO)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return govAgencyList;
    }
}
