package com.monitora.estagio.ceara.service;

import com.monitora.estagio.ceara.model.GovernmentAgency;
import com.monitora.estagio.ceara.repository.GovernmentAgencyRepository;
import com.monitora.estagio.ceara.usecases.search.SearchAverageSalary;
import com.monitora.estagio.ceara.utils.dto.ResultSearchDTO;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
        return mapByAgency.entrySet().stream()
                .map(entry -> {
                    List<GovernmentAgency> agencies = entry.getValue();
                    BigDecimal total = agencies.stream()
                            .map(GovernmentAgency::getGrossSalary)
                            .reduce(BigDecimal.ZERO, BigDecimal::add);
                    BigDecimal average = total.divide(BigDecimal.valueOf(agencies.size()), 2, RoundingMode.HALF_UP);
                    return new ResultSearchDTO.Builder()
                            .governmentAgency(entry.getKey())
                            .averageSalary(average).build();
                })
                .collect(Collectors.toList());
    }
}
