package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x;

class FraudRuleCity extends FraudRule {

    public FraudRuleCity(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCity().equals("Sydney");
    }

}
