package student_yurii_panasiuk.lesson_10.level_5_6;

import java.util.List;

class Test_02_Nick_positive {

   static void execute()

    {
        List<FraudRule> listOfFraudRules = List.of(
                new FraudRule1("Fraud Nick"),
                new FraudRule2("maximumAmount"),
                new FraudRule3("fraudCity"),
                new FraudRule4("stateBlocked"),
                new FraudRule5("State and max amount"));

        FraudDetector transactionsList = new FraudDetector(listOfFraudRules);


        // Test 1 Nick +
        Trader trader1 = new Trader("Pokemone", "City1", "state");
        int moneyAmmount = 1;
        Transaction transaction1 = new Transaction(trader1, moneyAmmount);

        System.out.print("\nFraud nick positive test - ");
        System.out.println(transactionsList.isFraud(transaction1).getRuleName());

        if (transactionsList.isFraud(transaction1).getFraud()) {
            System.out.println("Transaction details: ");
            TestResultOutput.transactionDataOutput(transaction1);
        }
    }
}
