package student_yurii_panasiuk.lesson_10.level_5;

class FraudRule3Test {

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
