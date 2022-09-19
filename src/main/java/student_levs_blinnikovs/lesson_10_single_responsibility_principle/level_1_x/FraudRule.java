package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction transaction);

    public String getRuleName() {
        return this.ruleName;
    }
}
