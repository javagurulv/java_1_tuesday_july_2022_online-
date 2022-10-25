package student_yurii_panasiuk.lesson_10.level_5_6;

import java.util.List;

class Test_01_Nick_negative {

   static void execute()

    {
        List<FraudRule> listOfFraudRules = List.of(
                new FraudRule1("Fraud Nick"),
                new FraudRule2("maximumAmount"),
                new FraudRule3("fraudCity"),
                new FraudRule4("stateBlocked"),
                new FraudRule5("State and max amount"));

        FraudDetector transactionsList = new FraudDetector(listOfFraudRules);


        // Test 1 Nick -
        Trader trader2 = new Trader("pokemone", "City1", "state");
        int moneyAmmount2 = 1;
        Transaction transaction2 = new Transaction(trader2, moneyAmmount2);

        System.out.print("\nFraud nick negative test is - ");
        System.out.println(transactionsList.isFraud(transaction2).getRuleName());

        if (transactionsList.isFraud(transaction2).getFraud()){
            System.out.println("Transaction details: ");
            TestResultOutput.transactionDataOutput(transaction2);
        }
    }
}
