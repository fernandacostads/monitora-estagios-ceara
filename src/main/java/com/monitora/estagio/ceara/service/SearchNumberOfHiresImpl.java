package com.monitora.estagio.ceara.service;

import com.monitora.estagio.ceara.model.GovernmentAgency;
import com.monitora.estagio.ceara.repository.GovernmentAgencyRepository;
import com.monitora.estagio.ceara.usecases.search.SearchNumberOfHires;
import com.monitora.estagio.ceara.utils.dto.ResultSearchDTO;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchNumberOfHiresImpl implements SearchNumberOfHires {

    private final GovernmentAgencyRepository repository;

    public SearchNumberOfHiresImpl(GovernmentAgencyRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ResultSearchDTO> exucute() {
        Map<String, List<GovernmentAgency>> mapByAgency = repository.getMapByAgency();
        return mapByAgency.entrySet().stream()
                .map(entry -> new ResultSearchDTO(entry.getKey(), entry.getValue().size()))
                .collect(Collectors.toList());
    }

}
