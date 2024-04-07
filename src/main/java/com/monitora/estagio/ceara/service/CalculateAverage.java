package com.monitora.estagio.ceara.service;

import com.monitora.estagio.ceara.model.GovernmentAgency;
import com.monitora.estagio.ceara.utils.dto.ResultSearchDTO;

import java.math.BigDecimal;
import java.util.List;

@FunctionalInterface
public interface CalculateAverage {
    BigDecimal calculate(List<GovernmentAgency> agency);
}
