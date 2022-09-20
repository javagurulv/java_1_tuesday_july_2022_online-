package student_levs_blinnikovs.lesson_10_single_responsibility_principle.dev_tech_task;

import java.util.List;

class RiskItem {

    private String riskItemName;
    private List<RiskSubItem> riskSubItems;

    RiskItem(List<RiskSubItem> riskSubItems) {
        this.riskSubItems = riskSubItems;
    }

    public List<RiskSubItem> getRiskSubItems() {
        return riskSubItems;
    }

}
