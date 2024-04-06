package com.monitora.estagio.ceara.utils.load;

import com.monitora.estagio.ceara.config.RepositoryConfig;
import com.monitora.estagio.ceara.usecases.load.LoadAllGovernmentAgency;

public class LoadAllGovernmentAgencyImpl implements LoadAllGovernmentAgency {

    @Override
    public String[] getAll() {
        System.out.println(RepositoryConfig.getMapByAgencyDTO().keySet().size());
        return RepositoryConfig.getMapByAgencyDTO().keySet().toArray(String[]::new);
    }
}
