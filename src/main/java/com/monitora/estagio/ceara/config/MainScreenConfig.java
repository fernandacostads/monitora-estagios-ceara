package com.monitora.estagio.ceara.config;

import com.monitora.estagio.ceara.controller.Controller;
import com.monitora.estagio.ceara.controller.CustomFilterControllerImpl;
import com.monitora.estagio.ceara.utils.dto.FilterDTO;
import com.monitora.estagio.ceara.utils.load.LoadAllGovernmentAgencyImpl;
import com.monitora.estagio.ceara.utils.load.LoadAllListOrderingImpl;
import com.monitora.estagio.ceara.utils.load.LoadAllSearchTypeImpl;
import com.monitora.estagio.ceara.view.MainScreen;


public class MainScreenConfig {
    public static MainScreen config(Controller<FilterDTO> controller) {
        return new MainScreen(controller,
                new LoadAllGovernmentAgencyImpl(),
                new LoadAllListOrderingImpl(),
                new LoadAllSearchTypeImpl());
    }
}
