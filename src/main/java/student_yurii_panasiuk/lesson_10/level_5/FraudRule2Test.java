package student_yurii_panasiuk.lesson_10.level_5;

class FraudRule2Test {

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
