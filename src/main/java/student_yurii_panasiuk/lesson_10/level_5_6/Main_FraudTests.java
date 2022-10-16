package student_yurii_panasiuk.lesson_10.level_5_6;

import java.util.List;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_10_single_responsibility_principle/codereview/CleanCodeWarning_4.txt")
public class Main_FraudTests {
    public static void main(String[] args) {
    List<FraudRule> listOfFraudRules =List.of(
            new FraudRule1("Fraud Nick"),
            new FraudRule2("maximumAmount"),
            new FraudRule3("fraudCity"),
            new FraudRule4("stateBlocked"),
            new FraudRule5("State and max amount") );

    FraudDetector transactionsList = new FraudDetector (listOfFraudRules);

       // Test 1 Nick +
        Trader trader1 = new Trader("Pokemone", "City1", "state");
        int moneyAmmount = 1;
        Transaction transaction1 = new Transaction(trader1, moneyAmmount);

        System.out.print("\nFraud nick positive test - ");
        System.out.println(transactionsList.isFraud(transaction1).getRuleName());

        if (transactionsList.isFraud(transaction1).getFraud()){
        System.out.println("Transaction details: ");
        TestResultOutput.transactionDataOutput(transaction1);
        }

        // Test 2 Nick -
        Trader trader2 = new Trader("pokemone", "City1", "state");
        int moneyAmmount2 = 1;
        Transaction transaction2 = new Transaction(trader2, moneyAmmount2);

        System.out.print("\nFraud nick negative test is - ");
        System.out.println(transactionsList.isFraud(transaction2).getRuleName());

        if (transactionsList.isFraud(transaction2).getFraud()){
            System.out.println("Transaction details: ");
            TestResultOutput.transactionDataOutput(transaction2);
        }

        //Test 3 Max +
        Trader trader3 = new Trader("pokemone", "City1", "state");
        int moneyAmmount3 = 1000001;
        Transaction transaction3 = new Transaction(trader2, moneyAmmount3);

        System.out.print("\nFraud Maximun transaction volume positive test is - ");
        System.out.println(transactionsList.isFraud(transaction3).getRuleName());

        if (transactionsList.isFraud(transaction3).getFraud()){
            System.out.println("Transaction details: ");
            TestResultOutput.transactionDataOutput(transaction3);
        }

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