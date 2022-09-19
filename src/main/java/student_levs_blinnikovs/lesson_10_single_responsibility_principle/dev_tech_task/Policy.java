package student_levs_blinnikovs.lesson_10_single_responsibility_principle.dev_tech_task;

class Policy {

    private String policyNumber;
    private PolicyStatus policystatus;
    private RiskItem[] riskItems;

    Policy(RiskItem[] riskItems) {
        this.riskItems = riskItems;
    }

    public RiskItem[] getRiskItems() {
        return riskItems;
    }
}
