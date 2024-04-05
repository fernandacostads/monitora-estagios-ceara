package com.monitora.estagio.ceara.repository;

import com.monitora.estagio.ceara.model.GovernmentAgency;
import com.monitora.estagio.ceara.utils.dto.GovernmentAgencyDTO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConverterListGovernmentAgencyDTO {
    private final static ConverterGovernmentAgencyDTO converterDTO = (GovernmentAgencyDTO governmentAgencyDTO) -> new GovernmentAgency(
            governmentAgencyDTO.date(),
            governmentAgencyDTO.personName(),
            governmentAgencyDTO.agency(),
            governmentAgencyDTO.role(),
            governmentAgencyDTO.functionStatus(),
            governmentAgencyDTO.discountTotal(),
            new BigDecimal(governmentAgencyDTO.reductionBasedConstitutionalCeiling()),
            new BigDecimal(governmentAgencyDTO.otherDiscounts()),
            new BigDecimal(governmentAgencyDTO.grossSalary()),
            new BigDecimal(governmentAgencyDTO.netSalary()),
            Long.parseLong(governmentAgencyDTO.daily().replace(".", ""))
    );

    protected static List<GovernmentAgency> converterList(List<GovernmentAgencyDTO> listDTOS) {
        return listDTOS.stream()
                .map(converterDTO::converterDTO)
                .collect(Collectors.toList());
    }
}
