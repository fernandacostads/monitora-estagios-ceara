package com.monitora.estagio.ceara.utils.load;

import com.monitora.estagio.ceara.usecases.load.LoadAllSearchType;

public class LoadAllSearchTypeImpl implements LoadAllSearchType {

    @Override
    public String[] getAll() {
        return new String[] { "Número de contratação", "Média salarial", "Taxa de contratação" };
    }
}
