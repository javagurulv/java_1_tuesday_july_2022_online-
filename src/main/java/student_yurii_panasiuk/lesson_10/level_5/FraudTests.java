package student_yurii_panasiuk.lesson_10.level_5;

import java.util.List;

public class FraudTests {
    public static void main(String[] args) {
    List<FraudRule> listOfFraudRules =List.of(
            new FraudRule1("Fraud Nick"),
            new FraudRule2("maximumAmount"),
            new FraudRule3("fraudCity"),
            new FraudRule4("stateBlocked"),
            new FraudRule5("State and max amount") );

    FraudDetector transactionsList = new FraudDetector (listOfFraudRules);

       // Test 1
        Trader trader1 = new Trader("Pokemone", "City1", "state");
        int moneyAmmount = 1;
        Transaction transaction1 = new Transaction(trader1, moneyAmmount);

        System.out.print("Fraud nick positive test is");
        TestResultOutput.testResult(transactionsList.isFraud(transaction1) );

        // Test 2
        Trader trader2 = new Trader("pokemone", "City1", "state");
        int moneyAmmount2 = 1;
        Transaction transaction2 = new Transaction(trader2, moneyAmmount2);

        System.out.print("Fraud nick negative test is");
        TestResultOutput.testResult(!transactionsList.isFraud(transaction2) );

}
}