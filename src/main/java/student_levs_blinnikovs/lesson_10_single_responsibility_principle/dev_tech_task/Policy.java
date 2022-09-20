package student_levs_blinnikovs.lesson_10_single_responsibility_principle.dev_tech_task;

import java.util.ArrayList;

class Policy {

    private String policyNumber;
    private PolicyStatus policystatus;
    private ArrayList<RiskItem> riskItems;

    Policy(ArrayList<RiskItem> riskItems) {
        this.riskItems = riskItems;
    }

    public ArrayList<RiskItem> getRiskItems() {
        return riskItems;
    }
}
