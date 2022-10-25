package student_yurii_panasiuk.lesson_10.level_5_6;

//import teacher.codereview.CodeReview;
//import teacher.codereview.CodeReviewComment;

//@CodeReview(approved = false)
//@CodeReviewComment(teacher = "А где эти тесты запускаются?")
class FraudRule3Test {
    public static void main(String[] args) {
        FraudRule3Test test = new FraudRule3Test();
        test.fraudCityPositiveTest();
        test.fraudCityNegativeTest();
    }
    void fraudCityPositiveTest(){
        Trader trader1 = new Trader("pokemone", "Сидней");
        int moneyAmmount = 1;
        Transaction transaction1 = new Transaction(trader1, moneyAmmount);
        FraudRule3 fraudTest = new FraudRule3("fraudCity");
        System.out.print("Fraud city positive test is");
        TestResultOutput.testResult(fraudTest.isFraud(transaction1));
    }

    void fraudCityNegativeTest(){
        Trader trader1 = new Trader("pokemone", "cидней");
        int moneyAmmount = 1;
        Transaction transaction1 = new Transaction(trader1, moneyAmmount);
        FraudRule3 fraudTest = new FraudRule3("fraudCity");
        System.out.print("Fraud city negative test is");
        TestResultOutput.testResult(!fraudTest.isFraud(transaction1));
    }

}
