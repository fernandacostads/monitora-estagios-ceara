package com.monitora.estagio.ceara.service;

import com.monitora.estagio.ceara.usecases.search.CustomFilter;
import com.monitora.estagio.ceara.utils.dto.ResultSearchDTO;

import java.util.Comparator;
import java.util.List;

public class CustomFilterServiceImpl implements CustomFilter {
    @Override
    public List<ResultSearchDTO> filter(List<ResultSearchDTO> governmentAgencyDTOList, String selectedGovernmentAgency, String ordering) {
        if (selectedGovernmentAgency.equalsIgnoreCase("todos")) {
             governmentAgencyDTOList.sort(Comparator.comparing(ResultSearchDTO::AverageSalary));
        } else {
            governmentAgencyDTOList.removeIf(resultSearchDTO ->
                    !resultSearchDTO.governmentAgency().equalsIgnoreCase(selectedGovernmentAgency));
        }
        System.out.println(governmentAgencyDTOList.size());
        return governmentAgencyDTOList;
    }
}
