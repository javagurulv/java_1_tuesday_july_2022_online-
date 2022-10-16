package student_olegs_radigins.lesson_10.level_1_2_3_4_5;

class FraudRule3Test {
    void positiveTest(){
        Trader trader = new Trader("NePokemon", "Сидней", "Latvia");
        Transaction transaction = new Transaction(trader, 1);
        FraudRule3 fraudRule3 = new FraudRule3("Fraud city");
        if (fraudRule3.isFraud(transaction)){
            System.out.println("Positive test ok");
        }else {
            System.out.println("Positive test fail");
        }
    }
    void negativeTest(){
        Trader trader = new Trader("NePokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1);
        FraudRule3 fraudRule3 = new FraudRule3("Fraud city");
        if (!fraudRule3.isFraud(transaction)){
            System.out.println("Negative test ok");
        }else {
            System.out.println("Negative test fail");
        }
    }

    public static void main(String[] args) {
        FraudRule3Test fraudRule3Test = new FraudRule3Test();
        fraudRule3Test.positiveTest();
        fraudRule3Test.negativeTest();
    }
}
