package com.monitora.estagio.ceara.usecases.search;

import com.monitora.estagio.ceara.utils.dto.ResultSearchDTO;

import java.util.List;

public interface CustomFilter {
    List<ResultSearchDTO> filter(List<ResultSearchDTO> governmentAgencyDTOList, String selectedGovernmentAgency, String ordering);
}
