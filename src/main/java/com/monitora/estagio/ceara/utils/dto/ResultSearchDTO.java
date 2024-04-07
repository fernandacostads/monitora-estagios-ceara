package com.monitora.estagio.ceara.utils.dto;

import java.math.BigDecimal;

public record ResultSearchDTO(String governmentAgency, BigDecimal averageSalary, Integer numberOfHires, String result) {

    public String[] toArray() {
        return new String[] {governmentAgency, result};
    }

    public static class Builder {
        private String governmentAgency;
        private BigDecimal averageSalary;
        private Integer numberOfHires;
        private String result;


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

        public Builder result(Object result) {
            this.result = result.toString();
            return this;
        }


        public ResultSearchDTO build() {
            return new ResultSearchDTO(governmentAgency, averageSalary, numberOfHires, result);
        }
    }
}