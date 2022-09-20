package student_levs_blinnikovs.lesson_10_single_responsibility_principle.dev_tech_task;

import java.math.BigDecimal;
import java.util.List;

class RiskSubItem {

    private String riskSubItemName;
    private BigDecimal sumInsured;
    private List<RiskType> riskTypes;

    RiskSubItem(String riskSubItemName, BigDecimal sumInsured, List<RiskType> riskTypes) {
        this.riskSubItemName = riskSubItemName;
        this.sumInsured = sumInsured;
        this.riskTypes = riskTypes;
    }

    public List<RiskType> getRiskTypes() {
        return riskTypes;
    }

    public BigDecimal getSumInsured() {
        return sumInsured;
    }

}
