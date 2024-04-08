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
    public List<ResultSearchDTO> execute(FilterDTO dto) {
        List<ResultSearchDTO> resultSearchDTOS = dto.searchType()
                .equalsIgnoreCase("Número de contratação")
                ? service.searchNumberOfHires().exucute()
                : service.searchAverageSalary().exucute();
        resultSearchDTOS = service.customFilter().filter(resultSearchDTOS, dto.selectedGovernmentAgency(), dto.ordering());
        return resultSearchDTOS;
    }

}
