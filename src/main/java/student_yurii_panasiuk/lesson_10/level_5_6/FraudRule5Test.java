package student_yurii_panasiuk.lesson_10.level_5_6;

//import teacher.codereview.CodeReview;
//import teacher.codereview.CodeReviewComment;

//@CodeReview(approved = false)
//@CodeReviewComment(teacher = "А где эти тесты запускаются?")
class FraudRule5Test {

    public static void main(String[] args) {
        FraudRule5Test test = new FraudRule5Test();
        test.fraudRule5PositiveTest();
        test.fraudRule5NegativeTest();
    }

    void fraudRule5PositiveTest() {
       Trader trader1 = new Trader("pokemone", "City1", "Germany");
        int moneyAmmount = 1001;
        Transaction transaction1 = new Transaction(trader1, moneyAmmount);
        FraudRule5 fraudTest = new FraudRule5("State and max amount");
        System.out.print("Fraud Rule 5 positive test is");
        TestResultOutput.testResult(fraudTest.isFraud(transaction1));
    }

    void fraudRule5NegativeTest() {
        Trader trader1 = new Trader("pokemone", "City1", "germany");
        int moneyAmmount = 1000;
        Transaction transaction1 = new Transaction(trader1, moneyAmmount);
        FraudRule5 fraudTest = new FraudRule5("State and max amount");
        System.out.print("Fraud Rule 5 negative test is");
        TestResultOutput.testResult(!fraudTest.isFraud(transaction1));
        }


}
