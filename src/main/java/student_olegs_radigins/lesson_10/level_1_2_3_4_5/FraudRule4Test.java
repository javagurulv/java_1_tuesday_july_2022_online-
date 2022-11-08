package student_olegs_radigins.lesson_10.level_1_2_3_4_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FraudRule4Test {
    void positiveTest(){
        Trader trader = new Trader("NePokemon", "Сидней", "Ямайка");
        Transaction transaction = new Transaction(trader, 1);
        FraudRule4 fraudRule4 = new FraudRule4("Fraud country");
        if (fraudRule4.isFraud(transaction)){
            System.out.println("Positive test ok");
        }else {
            System.out.println("Positive test fail");
        }
    }
    void negativeTest(){
        Trader trader = new Trader("NePokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1);
        FraudRule4 fraudRule4 = new FraudRule4("Fraud country");
        if (!fraudRule4.isFraud(transaction)){
            System.out.println("Negative test ok");
        }else {
            System.out.println("Negative test fail");
        }
    }

    public static void main(String[] args) {
        FraudRule4Test fraudRule4Test = new FraudRule4Test();
        fraudRule4Test.positiveTest();
        fraudRule4Test.negativeTest();
    }
}
