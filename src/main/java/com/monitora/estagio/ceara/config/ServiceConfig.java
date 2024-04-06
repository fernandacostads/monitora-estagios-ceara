package com.monitora.estagio.ceara.config;

import com.monitora.estagio.ceara.usecases.search.CustomFilter;
import com.monitora.estagio.ceara.usecases.search.SearchAverageSalary;
import com.monitora.estagio.ceara.usecases.search.SearchNumberOfHires;

public record ServiceConfig(SearchNumberOfHires searchNumberOfHires, SearchAverageSalary searchAverageSalary, CustomFilter customFilter) {
}
