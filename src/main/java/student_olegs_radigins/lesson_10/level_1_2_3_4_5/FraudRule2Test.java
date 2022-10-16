package student_olegs_radigins.lesson_10.level_1_2_3_4_5;

class FraudRule2Test {
    void positiveTest(){
        Trader trader = new Trader("NePokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 10000000);
        FraudRule2 fraudRule2 = new FraudRule2("Max amount");
        if (fraudRule2.isFraud(transaction)){
            System.out.println("Positive test ok");
        }else {
            System.out.println("Positive test fail");
        }
    }
    void negativeTest(){
        Trader trader = new Trader("NePokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1);
        FraudRule2 fraudRule2 = new FraudRule2("Max amount");
        if (!fraudRule2.isFraud(transaction)){
            System.out.println("Negative test ok");
        }else {
            System.out.println("Negative test fail");
        }
    }

    public static void main(String[] args) {
        FraudRule2Test fraudRule2Test = new FraudRule2Test();
        fraudRule2Test.positiveTest();
        fraudRule2Test.negativeTest();
    }
}
