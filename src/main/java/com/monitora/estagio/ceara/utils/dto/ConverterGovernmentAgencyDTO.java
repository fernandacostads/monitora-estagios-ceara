package com.monitora.estagio.ceara.utils.dto;

import com.monitora.estagio.ceara.model.GovernmentAgency;
import java.math.BigDecimal;

public class ConverterGovernmentAgencyDTO {

    protected static GovernmentAgency converter(GovernmentAgencyDTO governmentAgencyDTO){

        //DateTimeFormatter regex = DateTimeFormatter.ofPattern("MM/yyyy");

        return new GovernmentAgency(
                governmentAgencyDTO.date(),
                governmentAgencyDTO.personName(),
                governmentAgencyDTO.agency(),
                governmentAgencyDTO.role(),
                governmentAgencyDTO.functionStatus(),
                governmentAgencyDTO.discountTotal(),
                new BigDecimal(governmentAgencyDTO.reductionBasedConstitutionalCeiling()),
                new BigDecimal(governmentAgencyDTO.otherDiscounts()),
                new BigDecimal(governmentAgencyDTO.grossSalary()),
                new BigDecimal(governmentAgencyDTO.netSalary()),
                Long.parseLong(governmentAgencyDTO.daily().replace(".", ""))
        );
    }
}
