package com.monitora.estagio.ceara.utils.load;

import com.monitora.estagio.ceara.config.MapConfig;
import com.monitora.estagio.ceara.usecases.load.LoadAllGovernmentAgency;

import java.util.Arrays;
import java.util.stream.Stream;

public class LoadAllGovernmentAgencyImpl implements LoadAllGovernmentAgency {

    @Override
    public String[] getAll() {
        Stream<String> allStream = Stream.of("Todos");
        Stream<String> agencyStream = MapConfig.getMapByAgencyDTO().keySet().stream();
        Stream<String> combinedStream = Stream.concat(allStream, agencyStream);

        return combinedStream.toArray(String[]::new);
    }
}
