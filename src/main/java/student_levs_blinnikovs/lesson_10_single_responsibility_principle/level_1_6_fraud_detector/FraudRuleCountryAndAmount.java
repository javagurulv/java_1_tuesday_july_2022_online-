package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_6_fraud_detector;

class FraudRuleCountryAndAmount extends FraudRule {

    public FraudRuleCountryAndAmount(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCountry().equals("Germany") &&
                transaction.getAmount() > 1000;
    }

}
