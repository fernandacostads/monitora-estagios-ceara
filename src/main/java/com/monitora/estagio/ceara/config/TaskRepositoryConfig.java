package com.monitora.estagio.ceara.config;

import com.monitora.estagio.ceara.repository.GovernmentAgencyRepository;
import com.monitora.estagio.ceara.utils.dto.GovernmentAgencyDTO;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class TaskRepositoryConfig implements Callable<GovernmentAgencyRepository> {

    private final Map<String, List<GovernmentAgencyDTO>> mapByAgencyDTO;

    public TaskRepositoryConfig(Map<String, List<GovernmentAgencyDTO>> mapByAgencyDTO) {
        this.mapByAgencyDTO = mapByAgencyDTO;
    }

    @Override
    public GovernmentAgencyRepository call() throws Exception {
        long inicio = System.currentTimeMillis();
        GovernmentAgencyRepository repository = new GovernmentAgencyRepository(mapByAgencyDTO);
        long fim = System.currentTimeMillis();
        System.out.println("TaskRepositoryConfig:" + (fim - inicio));
        return repository;
    }
}
