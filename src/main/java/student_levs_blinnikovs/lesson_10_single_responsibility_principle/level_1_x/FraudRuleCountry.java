package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x;

class FraudRuleCountry extends FraudRule {

    public FraudRuleCountry(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCountry().equals("Jamaica");
    }

}
