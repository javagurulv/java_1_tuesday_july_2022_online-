package student_yurii_panasiuk.lesson_10.level_5;

class FraudRule1 extends FraudRule {

    String fraudTraderNick = "Pokemone";

     FraudRule1(String ruleName) {
        super(ruleName);
     }

     boolean isFraud(Transaction t) {
         return t.getTrader().getFullName().equals(fraudTraderNick);
         }
}


