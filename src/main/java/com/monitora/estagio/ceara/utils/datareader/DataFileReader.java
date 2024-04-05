package com.monitora.estagio.ceara.utils.datareader;

import com.monitora.estagio.ceara.utils.dto.GovernmentAgencyDTO;

@FunctionalInterface
public interface DataFileReader {
    GovernmentAgencyDTO converterLineToDTO(String line);
}
