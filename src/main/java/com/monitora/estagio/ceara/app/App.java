package com.monitora.estagio.ceara.app;


import com.monitora.estagio.ceara.config.*;
import com.monitora.estagio.ceara.controller.Controller;
import com.monitora.estagio.ceara.controller.CustomFilterControllerImpl;
import com.monitora.estagio.ceara.repository.GovernmentAgencyRepository;
import com.monitora.estagio.ceara.utils.dto.FilterDTO;
import com.monitora.estagio.ceara.utils.dto.GovernmentAgencyDTO;
import com.monitora.estagio.ceara.view.MainScreen;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {

    public static void main(String[] args) {
        Map<String, List<GovernmentAgencyDTO>> mapByAgencyDTO = MapConfig.config();

        ServiceConfig service = ServiceConfigImpl.config(new GovernmentAgencyRepository(mapByAgencyDTO));

        Controller<FilterDTO> controller = new CustomFilterControllerImpl(service);

        MainScreen mainScreen = MainScreenConfig.config(controller);
        mainScreen.start();
    }

}
