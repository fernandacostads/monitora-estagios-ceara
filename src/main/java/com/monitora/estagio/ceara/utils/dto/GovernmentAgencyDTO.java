package com.monitora.estagio.ceara.utils.dto;

import com.monitora.estagio.ceara.model.GovernmentAgency;

public record GovernmentAgencyDTO (
        String date,
        String personName,
        String agency,
        String role,
        String functionStatus,
        String discountTotal,
        String reductionBasedConstitutionalCeiling,
        String otherDiscounts,
        String grossSalary,
        String netSalary,
        String daily) {

        public GovernmentAgency converter() {
            return ConverterGovernmentAgencyDTO.converter(this);
        }

}
