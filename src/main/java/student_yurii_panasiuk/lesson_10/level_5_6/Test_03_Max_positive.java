package student_yurii_panasiuk.lesson_10.level_5_6;

import java.util.List;

class Test_03_Max_positive {

   static void execute()

    {
        List<FraudRule> listOfFraudRules = List.of(
                new FraudRule1("Fraud Nick"),
                new FraudRule2("maximumAmount"),
                new FraudRule3("fraudCity"),
                new FraudRule4("stateBlocked"),
                new FraudRule5("State and max amount"));

        FraudDetector transactionsList = new FraudDetector(listOfFraudRules);


        //Test 3 Max +
        Trader trader3 = new Trader("pokemone", "City1", "state");
        int moneyAmmount3 = 1000001;
        Transaction transaction3 = new Transaction(trader3, moneyAmmount3);

        System.out.print("\nFraud Maximun transaction volume positive test is - ");
        System.out.println(transactionsList.isFraud(transaction3).getRuleName());

        if (transactionsList.isFraud(transaction3).getFraud()){
            System.out.println("Transaction details: ");
            TestResultOutput.transactionDataOutput(transaction3);
        }
    }
}
