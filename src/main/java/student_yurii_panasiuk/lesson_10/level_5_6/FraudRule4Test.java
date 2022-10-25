package student_yurii_panasiuk.lesson_10.level_5_6;

//import teacher.codereview.CodeReview;
//import teacher.codereview.CodeReviewComment;

//@CodeReview(approved = false)
//@CodeReviewComment(teacher = "А где эти тесты запускаются?")
class FraudRule4Test {
    public static void main(String[] args) {
        FraudRule4Test test = new FraudRule4Test();
        test.fraudStatePositiveTest();
        test.fraudStateNegativeTest();
    }
    void fraudStatePositiveTest() {
        Trader trader1 = new Trader("pokemone", "cидней", "Ямайка");
        int moneyAmmount = 1;
        Transaction transaction1 = new Transaction(trader1, moneyAmmount);
        FraudRule4 fraudTest = new FraudRule4("stateBlocked");
        System.out.print("Fraud state negative test is");
        TestResultOutput.testResult(fraudTest.isFraud(transaction1));
    }

    void fraudStateNegativeTest(){
        Trader trader1 = new Trader("pokemone", "cидней", "ямайка");
        int moneyAmmount = 1;
        Transaction transaction1 = new Transaction(trader1, moneyAmmount);
        FraudRule4 fraudTest = new FraudRule4("stateBlocked");
        System.out.print("Fraud state negative test is");
        TestResultOutput.testResult(!fraudTest.isFraud(transaction1));
    }

}
