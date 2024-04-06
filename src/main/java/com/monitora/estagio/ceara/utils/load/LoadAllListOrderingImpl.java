package com.monitora.estagio.ceara.utils.load;

import com.monitora.estagio.ceara.usecases.load.LoadAllListOrdering;

public class LoadAllListOrderingImpl implements LoadAllListOrdering {
    @Override
    public String[] getAll() {
        return new String[] {"Menor", "Maior"};
    }
}
