package com.monitora.estagio.ceara.controller;

import com.monitora.estagio.ceara.utils.dto.FilterDTO;

public interface Controller<T> {
    void execute(T dto);
}
