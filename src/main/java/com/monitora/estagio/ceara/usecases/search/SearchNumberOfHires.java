package com.monitora.estagio.ceara.usecases.search;

import com.monitora.estagio.ceara.model.GovernmentAgency;
import com.monitora.estagio.ceara.utils.dto.ResultSearchDTO;

import java.util.List;

public interface SearchNumberOfHires {
    List<ResultSearchDTO> exucute();
}
