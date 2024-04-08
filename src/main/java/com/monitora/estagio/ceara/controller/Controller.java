package com.monitora.estagio.ceara.controller;

import com.monitora.estagio.ceara.utils.dto.FilterDTO;
import com.monitora.estagio.ceara.utils.dto.ResultSearchDTO;

import java.util.List;

public interface Controller<T> {
    List<ResultSearchDTO> execute(T dto);
}
