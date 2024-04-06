package com.monitora.estagio.ceara.controller;

import com.monitora.estagio.ceara.utils.dto.FilterDTO;

public class CustomFilterControllerImpl implements Controller<FilterDTO>{
    @Override
    public void execute(FilterDTO dto) {
        String searchType = dto.searchType();
        String selectedGovernmentAgency = dto.selectedGovernmentAgency();
        String ordering = dto.ordering();
    }
}
