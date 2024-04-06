package com.monitora.estagio.ceara.config;

import com.monitora.estagio.ceara.controller.CustomFilterControllerImpl;
import com.monitora.estagio.ceara.utils.load.LoadAllGovernmentAgencyImpl;
import com.monitora.estagio.ceara.utils.load.LoadAllListOrderingImpl;
import com.monitora.estagio.ceara.utils.load.LoadAllSearchTypeImpl;
import com.monitora.estagio.ceara.view.MainScreen;


public class MainScreenConfig {
    public static MainScreen config() {
        return new MainScreen(new CustomFilterControllerImpl(),
                new LoadAllGovernmentAgencyImpl(),
                new LoadAllListOrderingImpl(),
                new LoadAllSearchTypeImpl());
    }
}
