package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_6_fraud_detector;

class FraudRuleName extends FraudRule {

    public FraudRuleName(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getFullName().equals("Pokemon");
    }

}
