package com.monitora.estagio.ceara.config;

import com.monitora.estagio.ceara.repository.GovernmentAgencyRepository;
import com.monitora.estagio.ceara.service.CustomFilterServiceImpl;
import com.monitora.estagio.ceara.service.SearchAverageSalaryImpl;
import com.monitora.estagio.ceara.service.SearchNumberOfHiresImpl;

public class ServiceConfigImpl {
    public static ServiceConfig config(GovernmentAgencyRepository repository){
        return new ServiceConfig(new SearchNumberOfHiresImpl(repository), new SearchAverageSalaryImpl(repository), new CustomFilterServiceImpl());
    }
}
