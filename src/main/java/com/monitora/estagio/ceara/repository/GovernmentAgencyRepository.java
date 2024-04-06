package com.monitora.estagio.ceara.repository;

import com.monitora.estagio.ceara.model.GovernmentAgency;
import com.monitora.estagio.ceara.utils.dto.GovernmentAgencyDTO;

import java.util.*;

public class GovernmentAgencyRepository {
    private final Map<String, List<GovernmentAgency>> mapByAgency;

    public GovernmentAgencyRepository(Map<String, List<GovernmentAgencyDTO>> mapByAgencyDTO) {
        long inicio = System.currentTimeMillis();

        TaskConverterToMapGovernmentAgency taskConverter = new TaskConverterToMapGovernmentAgency(mapByAgencyDTO);
        Thread converter = new Thread(taskConverter);
        converter.start();

        this.mapByAgency = ConverterToMapGovernmentAgency.converterMapByAgency(mapByAgencyDTO);

        System.out.println("size convertida: " + mapByAgencyDTO.size());

        long fim = System.currentTimeMillis();
        System.out.println("repository: " + (fim - inicio));
    }

    public Map<String, List<GovernmentAgency>> getMapByAgency() {
        return Collections.unmodifiableMap(mapByAgency);
    }
}
