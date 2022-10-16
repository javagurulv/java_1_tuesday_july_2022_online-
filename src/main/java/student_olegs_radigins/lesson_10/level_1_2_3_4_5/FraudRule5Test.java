package student_olegs_radigins.lesson_10.level_1_2_3_4_5;

public class FraudRule5Test {
    void positiveTest(){
        Trader trader = new Trader("NePokemon", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 10000);
        FraudRule5 fraudRule5 = new FraudRule5("Warning country");
        if (fraudRule5.isFraud(transaction)){
            System.out.println("Positive test ok");
        }else {
            System.out.println("Positive test fail");
        }
    }
    void negativeTest(){
        Trader trader = new Trader("NePokemon", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1);
        FraudRule5 fraudRule5 = new FraudRule5("Warning country");
        if (!fraudRule5.isFraud(transaction)){
            System.out.println("Negative test ok");
        }else {
            System.out.println("Negative test fail");
        }
    }

    public static void main(String[] args) {
        FraudRule5Test fraudRule5Test = new FraudRule5Test();
        fraudRule5Test.positiveTest();
        fraudRule5Test.negativeTest();
    }
}
