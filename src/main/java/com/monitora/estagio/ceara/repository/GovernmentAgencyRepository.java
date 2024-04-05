package com.monitora.estagio.ceara.repository;

import com.monitora.estagio.ceara.model.GovernmentAgency;
import com.monitora.estagio.ceara.utils.dto.GovernmentAgencyDTO;

import java.util.List;

public class GovernmentAgencyRepository {

    private List<GovernmentAgency> list2021;
    private List<GovernmentAgency> list2022;
    private List<GovernmentAgency> list2023;
    private List<GovernmentAgency> list2024;

    public GovernmentAgencyRepository(List<GovernmentAgencyDTO> list2021, List<GovernmentAgencyDTO> list2022, List<GovernmentAgencyDTO> list2023, List<GovernmentAgencyDTO> list2024) {
        this.list2021 = ConverterToListGovernmentAgency.converterList(list2021);
        this.list2022 = ConverterToListGovernmentAgency.converterList(list2022);
        this.list2023 = ConverterToListGovernmentAgency.converterList(list2023);
        this.list2024 = ConverterToListGovernmentAgency.converterList(list2024);
    }

    public List<GovernmentAgency> getList2021() {
        return list2021;
    }

    public List<GovernmentAgency> getList2022() {
        return list2022;
    }

    public List<GovernmentAgency> getList2023() {
        return list2023;
    }

    public List<GovernmentAgency> getList2024() {
        return list2024;
    }
}
