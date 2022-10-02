package student_yurii_panasiuk.lesson_10.level_5_6;

class FraudRule5Test {

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
        System.out.print("Fraud Rule 5 positive test is");
        TestResultOutput.testResult(!fraudTest.isFraud(transaction1));
    }

}
