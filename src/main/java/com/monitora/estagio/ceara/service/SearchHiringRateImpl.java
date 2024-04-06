package com.monitora.estagio.ceara.service;

import com.monitora.estagio.ceara.repository.GovernmentAgencyRepository;
import com.monitora.estagio.ceara.usecases.search.SearchHiringRate;
import com.monitora.estagio.ceara.utils.dto.ResultSearchDTO;

import java.util.List;

public class SearchHiringRateImpl implements SearchHiringRate {

    private final GovernmentAgencyRepository repository;

    public SearchHiringRateImpl(GovernmentAgencyRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ResultSearchDTO> exucute() {
        return null;
    }
}
