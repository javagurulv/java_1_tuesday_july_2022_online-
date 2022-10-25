package student_yurii_panasiuk.lesson_10.level_5_6;

import java.util.List;

class Test_04_Max_negative {

   static void execute()

    {
        List<FraudRule> listOfFraudRules = List.of(
                new FraudRule1("Fraud Nick"),
                new FraudRule2("maximumAmount"),
                new FraudRule3("fraudCity"),
                new FraudRule4("stateBlocked"),
                new FraudRule5("State and max amount"));

        FraudDetector transactionsList = new FraudDetector(listOfFraudRules);


        //Test 4 Max -
        Trader trader4 = new Trader("pokemone", "City1", "state");
        int moneyAmmount4 = 1000000;
        Transaction transaction4 = new Transaction(trader4, moneyAmmount4);

        System.out.print("\nFraud Maximun transaction volume positive test is - ");
        System.out.println(transactionsList.isFraud(transaction4).getRuleName());

        if (transactionsList.isFraud(transaction4).getFraud()){
            System.out.println("Transaction details: ");
            TestResultOutput.transactionDataOutput(transaction4);
        }
    }
}
