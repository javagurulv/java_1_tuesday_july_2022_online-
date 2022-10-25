package student_yurii_panasiuk.lesson_10.level_5_6;

//import teacher.codereview.CodeReview;
//import teacher.codereview.CodeReviewComment;

//@CodeReview(approved = false)
//@CodeReviewComment(teacher = "А где эти тесты запускаются?")
class FraudRule2Test {
    public static void main(String[] args) {
        FraudRule2Test test = new FraudRule2Test();
        test.fraudMaximumAmountPositiveTest();
        test.fraudMaximumAmountNegatigeTest();
    }
    void fraudMaximumAmountPositiveTest(){
        Trader trader1 = new Trader("pokemone", "City1");
        int moneyAmmount = 1000001;
        Transaction transaction1 = new Transaction(trader1, moneyAmmount);
        FraudRule2 fraudTest = new FraudRule2("maximumAmount");
        System.out.print("Maximum Amount positive test is");
        TestResultOutput.testResult(fraudTest.isFraud(transaction1));
    }

    void fraudMaximumAmountNegatigeTest(){
        Trader trader1 = new Trader("pokemone", "City1");
        int moneyAmmount = 1000000;
        Transaction transaction1 = new Transaction(trader1, moneyAmmount);
        FraudRule2 fraudTest = new FraudRule2("maximumAmount");
        System.out.print("Maximum Amount negative test is");
        TestResultOutput.testResult(!fraudTest.isFraud(transaction1));
    }

}
