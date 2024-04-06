package com.monitora.estagio.ceara.config;

import com.monitora.estagio.ceara.controller.CustomFilterControllerImpl;
import com.monitora.estagio.ceara.repository.GovernmentAgencyRepository;

public class ControllerConfig {

    public static CustomFilterControllerImpl config(ServiceConfig serviceConfig){
        return new CustomFilterControllerImpl(serviceConfig);
    }
}
