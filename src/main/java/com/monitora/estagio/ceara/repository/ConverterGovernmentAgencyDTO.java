package com.monitora.estagio.ceara.repository;

import com.monitora.estagio.ceara.model.GovernmentAgency;
import com.monitora.estagio.ceara.utils.dto.GovernmentAgencyDTO;

@FunctionalInterface
public interface ConverterGovernmentAgencyDTO {
    GovernmentAgency converterDTO(GovernmentAgencyDTO governmentAgencyDTO);
}
