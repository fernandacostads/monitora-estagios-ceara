package com.monitora.estagio.ceara.service;

import com.monitora.estagio.ceara.utils.dto.ResultSearchDTO;

import java.math.BigDecimal;

@FunctionalInterface
public interface CreateResultSearchDTO {
    ResultSearchDTO newDTO(String entry, BigDecimal average);
}
