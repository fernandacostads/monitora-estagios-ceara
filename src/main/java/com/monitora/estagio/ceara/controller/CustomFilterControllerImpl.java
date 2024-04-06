package com.monitora.estagio.ceara.controller;

import com.monitora.estagio.ceara.config.ServiceConfig;
import com.monitora.estagio.ceara.utils.dto.FilterDTO;
import com.monitora.estagio.ceara.utils.dto.ResultSearchDTO;

import java.util.List;

public class CustomFilterControllerImpl implements Controller<FilterDTO>{

    private final ServiceConfig service;

    public CustomFilterControllerImpl(ServiceConfig service) {
        this.service = service;
    }

    @Override
    public void execute(FilterDTO dto) {
        String searchType = dto.searchType();
        String selectedGovernmentAgency = dto.selectedGovernmentAgency();
        String ordering = dto.ordering();

        List<ResultSearchDTO> searchAverageSalary = service.searchAverageSalary().exucute();
        List<ResultSearchDTO> searchNumberOfHires = service.searchNumberOfHires().exucute();

        System.out.println(searchAverageSalary.size());
        System.out.println();
        System.out.println(searchNumberOfHires.size());
    }
}
