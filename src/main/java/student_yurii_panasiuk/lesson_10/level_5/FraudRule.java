package student_yurii_panasiuk.lesson_10.level_5;

abstract class FraudRule {

    private String ruleName;
   /*
    String fraudTraderNick = "Pokemone";
    int maximumAmount = 1000000;
    String fraudCity = "Сидней";
    String stateBlocked = "Ямайка";
       */

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

     abstract boolean isFraud(Transaction t);

}