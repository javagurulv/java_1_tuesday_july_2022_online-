package student_levs_blinnikovs.lesson_10_single_responsibility_principle.dev_tech_task;

import java.util.ArrayList;

class RiskItem {

    private String riskItemName;
    private ArrayList<RiskSubItem> riskSubItems;
    private double totalSumInsured;

    RiskItem(ArrayList<RiskSubItem> riskSubItems) {
        this.riskSubItems = riskSubItems;
    }

    public ArrayList<RiskSubItem> getRiskSubItems() {
        return riskSubItems;
    }

}
