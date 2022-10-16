package student_olegs_radigins.lesson_10.level_1_2_3_4_5;

class FraudRule1Test {
    void positiveTest(){
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1);
        FraudRule1 fraudRule1 = new FraudRule1("Pokemon");
        if (fraudRule1.isFraud(transaction)){
            System.out.println("Positive test ok");
        }
    }
    void negativeTest(){
        Trader trader = new Trader("Pokemone", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1);
        FraudRule1 fraudRule1 = new FraudRule1("Pokemon");
        if (!fraudRule1.isFraud(transaction)){
            System.out.println("Negative test ok");
        }
    }

    public static void main(String[] args) {
        FraudRule1Test fraudRule1Test = new FraudRule1Test();
        fraudRule1Test.positiveTest();
        fraudRule1Test.negativeTest();
    }
}
