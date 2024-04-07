package com.monitora.estagio.ceara.service;

import com.monitora.estagio.ceara.model.GovernmentAgency;
import com.monitora.estagio.ceara.repository.GovernmentAgencyRepository;
import com.monitora.estagio.ceara.usecases.search.SearchAverageSalary;
import com.monitora.estagio.ceara.utils.dto.ResultSearchDTO;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchAverageSalaryImpl implements SearchAverageSalary {
    private final GovernmentAgencyRepository repository;

    public SearchAverageSalaryImpl(GovernmentAgencyRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ResultSearchDTO> exucute() {
        Map<String, List<GovernmentAgency>> mapByAgency = repository.getMapByAgency();

        CalculateAverage calculateAverage = (List<GovernmentAgency> agency) -> agency.stream()
                .map(GovernmentAgency::getGrossSalary)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .divide(BigDecimal.valueOf(agency.size()), 2, RoundingMode.HALF_UP);

        CreateResultSearchDTO createResultSearchDTO = (String entry, BigDecimal average) ->
                new ResultSearchDTO.Builder()
                        .governmentAgency(entry)
                        .averageSalary(average)
                        .result(average)
                        .build();

        return mapByAgency.entrySet().stream()
                .map(entry -> createResultSearchDTO.newDTO(entry.getKey(), calculateAverage.calculate(entry.getValue())
                )).sorted(Comparator.comparing(ResultSearchDTO::averageSalary))
                .collect(Collectors.toList());
    }
}