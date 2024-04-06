package com.monitora.estagio.ceara.utils.load;

import com.monitora.estagio.ceara.config.MapConfig;
import com.monitora.estagio.ceara.usecases.load.LoadAllGovernmentAgency;

public class LoadAllGovernmentAgencyImpl implements LoadAllGovernmentAgency {

    @Override
    public String[] getAll() {
        System.out.println("size DTO: " + MapConfig.getMapByAgencyDTO().keySet().size());
        return MapConfig.getMapByAgencyDTO().keySet().toArray(String[]::new);
    }
}
