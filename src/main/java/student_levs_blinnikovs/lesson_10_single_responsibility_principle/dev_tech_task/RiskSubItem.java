package student_levs_blinnikovs.lesson_10_single_responsibility_principle.dev_tech_task;

import java.math.BigDecimal;

class RiskSubItem {

    private String riskSubItemName;
    private BigDecimal sumInsured;
    private RiskType riskType;

    RiskSubItem(String riskSubItemName, BigDecimal sumInsured, RiskType riskType) {
        this.riskSubItemName = riskSubItemName;
        this.sumInsured = sumInsured;
        this.riskType = riskType;
    }

    public RiskType getRiskType() {
        return riskType;
    }

    public BigDecimal getSumInsured() {
        return sumInsured;
    }

}
