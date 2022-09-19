package student_levs_blinnikovs.lesson_10_single_responsibility_principle.dev_tech_task;

class RiskItem {

    private String riskItemName;
    private RiskSubItem[] riskSubItems;
    private double totalSumInsured;

    RiskItem(RiskSubItem[] riskSubItems) {
        this.riskSubItems = riskSubItems;
    }

    private double calculateRiskSubItemTotalSumInsuredByRiskType(RiskSubItem[] riskSubItems, RiskType riskType) {         // todo remove or reuse
        for (RiskSubItem riskSubItem : riskSubItems) {
            if (riskSubItem.getRiskType().equals(riskType)) {
                totalSumInsured += riskSubItem.getSumInsured();
            }
        }
        return totalSumInsured;
    }

    public RiskSubItem[] getRiskSubItems() {
        return riskSubItems;
    }

    public double getTotalSumInsured() {
        return totalSumInsured;
    }
}
