package student_yurii_panasiuk.lesson_10.level_5_6;

//import teacher.codereview.CodeReview;
//import teacher.codereview.CodeReviewComment;

//@CodeReview(approved = false)
//@CodeReviewComment(teacher = "А где эти тесты запускаются?")
class FraudRule1Test {
    public static void main(String[] args) {
        FraudRule1Test test = new FraudRule1Test();
        test.fraudNickPositiveTest();
        test.fraudNickNegativeTest();
    }
     void fraudNickPositiveTest(){
        Trader trader1 = new Trader("Pokemone", "City1");
        int moneyAmmount = 1;
        Transaction transaction1 = new Transaction(trader1, moneyAmmount);
        FraudRule1 fraudTest = new FraudRule1("Fraud Nick");
        System.out.print("Fraud nick positive test is");
        TestResultOutput.testResult(fraudTest.isFraud(transaction1));
    }

    void fraudNickNegativeTest(){
        Trader trader1 = new Trader("pokemone", "City1");
        int moneyAmmount = 1;
        Transaction transaction1 = new Transaction(trader1, moneyAmmount);
        FraudRule1 fraudTest = new FraudRule1("Fraud Nick");
        System.out.print("Fraud nick negative test is");
        TestResultOutput.testResult(!fraudTest.isFraud(transaction1));
    }

}

