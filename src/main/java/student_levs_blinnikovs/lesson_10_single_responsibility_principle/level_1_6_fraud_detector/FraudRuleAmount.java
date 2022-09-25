package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_6_fraud_detector;

class FraudRuleAmount extends FraudRule {

    public FraudRuleAmount(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }

}
