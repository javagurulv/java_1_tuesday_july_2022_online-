package student_yurii_panasiuk.lesson_10.level_5;

import student_yurii_panasiuk.lesson_10.level_1_4.task_1_16.FraudDetectorTest;

class FraudRule1Test {

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

