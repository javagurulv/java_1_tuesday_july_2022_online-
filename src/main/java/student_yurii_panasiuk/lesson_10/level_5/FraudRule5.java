package student_yurii_panasiuk.lesson_10.level_5;

class FraudRule5 extends FraudRule{

    String state = "Germany";
    int maximumAmount = 1000;

    FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    boolean isFraud(Transaction t) {
        return state.equals(t.getTrader().getState()) &&
                maximumAmount < t.getAmount();
    }
}
