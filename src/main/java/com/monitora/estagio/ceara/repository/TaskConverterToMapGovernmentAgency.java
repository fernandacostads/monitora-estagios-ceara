package com.monitora.estagio.ceara.repository;

import com.monitora.estagio.ceara.model.GovernmentAgency;
import com.monitora.estagio.ceara.utils.dto.GovernmentAgencyDTO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskConverterToMapGovernmentAgency implements Runnable{

    private Map<String, List<GovernmentAgency>> mapByAgency;
    private final Map<String, List<GovernmentAgencyDTO>> mapByAgencyDTO;
    private final ConverterToGovernmentAgency converterDTO;

    public TaskConverterToMapGovernmentAgency(Map<String, List<GovernmentAgencyDTO>> mapByAgencyDTO) {
        this.mapByAgencyDTO = mapByAgencyDTO;
        this.converterDTO = (GovernmentAgencyDTO governmentAgencyDTO) -> new GovernmentAgency(
                governmentAgencyDTO.date(),
                governmentAgencyDTO.personName(),
                governmentAgencyDTO.agency(),
                governmentAgencyDTO.role(),
                governmentAgencyDTO.functionStatus(),
                governmentAgencyDTO.discountTotal(),
                new BigDecimal(governmentAgencyDTO.reductionBasedConstitutionalCeiling()),
                new BigDecimal(governmentAgencyDTO.otherDiscounts()),
                new BigDecimal(governmentAgencyDTO.grossSalary()),
                new BigDecimal(governmentAgencyDTO.netSalary()),
                Long.parseLong(governmentAgencyDTO.daily().replace(".", ""))
        );
    }


    @Override
    public void run() {
        long inicio = System.currentTimeMillis();
        // Obtém um fluxo de conjuntos de entrada (Entry) do mapa mapByAgencyDTO
        this.mapByAgency = mapByAgencyDTO.entrySet().stream()
                //Coleta os elementos do fluxo de entrada em um mapa
                .collect(Collectors.toMap( // Usa a chave de cada conjunto de entrada como chave no mapa resultante
                        Map.Entry::getKey, // Acessa a chave
                        // Obtém a lista de valores associada à chave atual
                        entry -> entry.getValue()
                                .stream()
                                // Converte cada GovernmentAgencyDTO da lista para GovernmentAgency
                                .map(converterDTO::converterDTO)
                                .collect(Collectors.toList()) // Coleta em uma lista
                ));
        long fim = System.currentTimeMillis();
        System.out.println("convertendo DTOS: "+ (fim - inicio));
    }

    public Map<String, List<GovernmentAgency>> getMapByAgency() {
        return mapByAgency;
    }
}
