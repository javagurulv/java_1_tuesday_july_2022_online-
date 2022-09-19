package student_levs_blinnikovs.lesson_10_single_responsibility_principle.dev_tech_task;

class RiskSubItem {

    private String riskSubItemName;
    private double sumInsured;
    private RiskType riskType;

    RiskSubItem(String riskSubItemName, double sumInsured, RiskType riskType) {
        this.riskSubItemName = riskSubItemName;
        this.sumInsured = sumInsured;
        this.riskType = riskType;
    }

    public RiskType getRiskType() {
        return riskType;
    }

    public double getSumInsured() {
        return sumInsured;
    }

}
