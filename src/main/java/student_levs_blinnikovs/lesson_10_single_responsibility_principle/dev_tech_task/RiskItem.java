package student_levs_blinnikovs.lesson_10_single_responsibility_principle.dev_tech_task;

class RiskItem {

    private String riskItemName;
    private RiskSubItem[] riskSubItems;
    private double totalSumInsured;

    RiskItem(RiskSubItem[] riskSubItems) {
        this.riskSubItems = riskSubItems;
    }

    public RiskSubItem[] getRiskSubItems() {
        return riskSubItems;
    }

}
