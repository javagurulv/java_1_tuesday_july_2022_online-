package student_olegs_radigins.lesson_10.level_1_2_3_4_5;

class FraudRule1  extends FraudRule{
    public FraudRule1(String ruleName) {
        super(ruleName);


    }
    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }


}
