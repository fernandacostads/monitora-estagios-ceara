package com.monitora.estagio.ceara.utils.dto;

import java.math.BigDecimal;

public record ResultSearchDTO(String governmentAgency, BigDecimal AverageSalary, Integer NumberOfHires) {
    public static class Builder {
        private String governmentAgency;
        private BigDecimal averageSalary;
        private Integer numberOfHires;

        public Builder governmentAgency(String governmentAgency) {
            this.governmentAgency = governmentAgency;
            return this;
        }

        public Builder averageSalary(BigDecimal averageSalary) {
            this.averageSalary = averageSalary;
            return this;
        }

        public Builder numberOfHires(Integer numberOfHires) {
            this.numberOfHires = numberOfHires;
            return this;
        }

        public ResultSearchDTO build() {
            return new ResultSearchDTO(governmentAgency, averageSalary, numberOfHires);
        }
    }
}