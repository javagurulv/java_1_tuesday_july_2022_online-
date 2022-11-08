package student_olegs_radigins.lesson_10.level_1_2_3_4_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudRule1Test {
    void positiveTest(){
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1);
        FraudRule1 fraudRule1 = new FraudRule1("Pokemon");
        if (fraudRule1.isFraud(transaction)){
            System.out.println("Positive test ok");
        }else {
            System.out.println("Positive test fail");
        }
    }
    void negativeTest(){
        Trader trader = new Trader("Pokemone", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1);
        FraudRule1 fraudRule1 = new FraudRule1("Pokemon");
        if (!fraudRule1.isFraud(transaction)){
            System.out.println("Negative test ok");
        }else {
            System.out.println("Negative test fail");
        }
    }

    public static void main(String[] args) {
        FraudRule1Test fraudRule1Test = new FraudRule1Test();
        fraudRule1Test.positiveTest();
        fraudRule1Test.negativeTest();
    }
}
