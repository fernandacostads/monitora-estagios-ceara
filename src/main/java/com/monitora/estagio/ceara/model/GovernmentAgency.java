package com.monitora.estagio.ceara.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GovernmentAgency {
    private String date;
    private String personName;
    private String agency;
    private String role;
    private String functionStatus;
    private String discountTotal;
    private BigDecimal reductionBasedConstitutionalCeiling;
    private BigDecimal otherDiscounts;
    private BigDecimal grossSalary;
    private BigDecimal netSalary;
    private Long daily;


    public GovernmentAgency(String date, String personName, String agency,
                            String role, String functionStatus, String discountTotal,
                            BigDecimal reductionBasedConstitutionalCeiling, BigDecimal otherDiscounts,
                            BigDecimal grossSalary, BigDecimal netSalary, Long daily) {
        this.date = date;
        this.personName = personName;
        this.agency = agency;
        this.role = role;
        this.functionStatus = functionStatus;
        this.discountTotal = discountTotal;
        this.reductionBasedConstitutionalCeiling = reductionBasedConstitutionalCeiling;
        this.otherDiscounts = otherDiscounts;
        this.grossSalary = grossSalary;
        this.netSalary = netSalary;
        this.daily = daily;
    }

    @Override
    public String toString() {
        return "GovernmentAgency{" +
                "date=" + date +
                ", personName='" + personName + '\'' +
                ", agency='" + agency + '\'' +
                ", role='" + role + '\'' +
                ", functionStatus='" + functionStatus + '\'' +
                ", discountTotal='" + discountTotal + '\'' +
                ", reductionBasedConstitutionalCeiling=" + reductionBasedConstitutionalCeiling +
                ", otherDiscounts=" + otherDiscounts +
                ", grossSalary=" + grossSalary +
                ", netSalary=" + netSalary +
                ", daily=" + daily +
                '}';
    }

    public String getAgency() {
        return agency;
    }
    public BigDecimal getGrossSalary() {
        return grossSalary;
    }

}
