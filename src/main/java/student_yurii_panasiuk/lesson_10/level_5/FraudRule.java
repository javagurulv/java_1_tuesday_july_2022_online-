package student_yurii_panasiuk.lesson_10.level_5;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

     abstract boolean isFraud(Transaction t);

}