package student_levs_blinnikovs.lesson_10_single_responsibility_principle.dev_tech_task;

class RiskSubItem {

    private String riskSubItemName;
    private int sumInsured;
    private RiskType riskType;

    public RiskType getRiskType() {
        return riskType;
    }

    public int getSumInsured() {
        return sumInsured;
    }

}
