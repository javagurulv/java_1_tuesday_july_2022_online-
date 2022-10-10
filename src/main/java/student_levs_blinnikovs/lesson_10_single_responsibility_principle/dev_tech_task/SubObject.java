package student_levs_blinnikovs.lesson_10_single_responsibility_principle.dev_tech_task;

import java.math.BigDecimal;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SubObject {

    private String subObjectName;
    private BigDecimal sumInsured;
    private List<RiskType> riskTypes;

    SubObject(String subObjectName, BigDecimal sumInsured, List<RiskType> riskTypes) {
        this.subObjectName = subObjectName;
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
