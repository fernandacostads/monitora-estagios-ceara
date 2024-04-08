package com.monitora.estagio.ceara.repository;

import com.monitora.estagio.ceara.model.GovernmentAgency;
import com.monitora.estagio.ceara.utils.dto.GovernmentAgencyDTO;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class GovernmentAgencyRepository {
    private final Map<String, List<GovernmentAgency>> mapByAgency;

    public GovernmentAgencyRepository(Map<String, List<GovernmentAgencyDTO>> mapByAgency) {
        this.mapByAgency = ConverterToMapGovernmentAgency.converterMapByAgency(mapByAgency);
    }

    public Map<String, List<GovernmentAgency>> getMapByAgency() {
        return Collections.unmodifiableMap(mapByAgency);
    }

}
