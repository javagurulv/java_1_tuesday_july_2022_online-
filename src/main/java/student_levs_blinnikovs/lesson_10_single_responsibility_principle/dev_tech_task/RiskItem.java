package student_levs_blinnikovs.lesson_10_single_responsibility_principle.dev_tech_task;

class RiskItem {

    private String riskItemName;
    private RiskSubItem[] riskSubItems;
    private int totalSumInsured;                                // TODO ask Viktor - maybe redundant

    private int calculateRiskSubItemTotalSumInsuredByRiskType(RiskSubItem[] riskSubItems, RiskType riskType) {
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

    public int getTotalSumInsured() {
        return totalSumInsured;
    }
}
