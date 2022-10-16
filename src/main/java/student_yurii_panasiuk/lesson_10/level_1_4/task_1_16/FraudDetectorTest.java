package student_yurii_panasiuk.lesson_10.level_1_4.task_1_16;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_10_single_responsibility_principle/codereview/CleanCodeWarning_2.txt")
public class FraudDetectorTest {
    public static void main(String[] args) {

        FraudDetectorTest test = new FraudDetectorTest();

        test.fraudNickPositiveTest();
        test.fraudNickNegativeTest();

        test.fraudMaximumAmountPositiveTest();
        test.fraudMaximumAmountNegatigeTest();

        test.fraudCityPositiveTest();
        test.fraudCityNegativeTest();

        test.fraudStatePositiveTest();
        test.fraudStateNegativeTest();

        test.fraudRule5PositiveTest();
        test.fraudRule5NegativeTest();

        //самые простые тесты. тут и так более 100 строк

    }

         void fraudNickPositiveTest(){
            Trader trader1 = new Trader("Pokemone", "City1");
            int moneyAmmount = 1;
            Transaction transaction1 = new Transaction(trader1, moneyAmmount);
            FraudDetector fraudTest = new FraudDetector();
            System.out.print("Fraud nick positive test is");
            testResult(fraudTest.isFraudName(transaction1));
        }

         void fraudNickNegativeTest(){
            Trader trader1 = new Trader("pokemone", "City1");
            int moneyAmmount = 1;
            Transaction transaction1 = new Transaction(trader1, moneyAmmount);
            FraudDetector fraudTest = new FraudDetector();
            System.out.print("Fraud nick negative test is");
            testResult(!fraudTest.isFraudName(transaction1));
        }

         void fraudMaximumAmountPositiveTest(){
             Trader trader1 = new Trader("pokemone", "City1");
             int moneyAmmount = 1000001;
             Transaction transaction1 = new Transaction(trader1, moneyAmmount);
             FraudDetector fraudTest = new FraudDetector();
             System.out.print("Maximum Amount positive test is");
             testResult(fraudTest.isMaximun(transaction1));
         }

         void fraudMaximumAmountNegatigeTest(){
              Trader trader1 = new Trader("pokemone", "City1");
              int moneyAmmount = 1000000;
              Transaction transaction1 = new Transaction(trader1, moneyAmmount);
              FraudDetector fraudTest = new FraudDetector();
              System.out.print("Maximum Amount negative test is");
              testResult(!fraudTest.isMaximun(transaction1));
         }

         void fraudCityPositiveTest(){
             Trader trader1 = new Trader("pokemone", "Сидней");
             int moneyAmmount = 1;
             Transaction transaction1 = new Transaction(trader1, moneyAmmount);
             FraudDetector fraudTest = new FraudDetector();
             System.out.print("Fraud city positive test is");
             testResult(fraudTest.isFraudCity(transaction1));
         }

         void fraudCityNegativeTest(){
              Trader trader1 = new Trader("pokemone", "cидней");
              int moneyAmmount = 1;
              Transaction transaction1 = new Transaction(trader1, moneyAmmount);
              FraudDetector fraudTest = new FraudDetector();
              System.out.print("Fraud city negative test is");
              testResult(!fraudTest.isFraudCity(transaction1));
         }

          void fraudStatePositiveTest() {
              Trader trader1 = new Trader("pokemone", "cидней", "Ямайка");
              int moneyAmmount = 1;
              Transaction transaction1 = new Transaction(trader1, moneyAmmount);
              FraudDetector fraudTest = new FraudDetector();
              System.out.print("Fraud state negative test is");
              testResult(fraudTest.isFraudState(transaction1));
          }

         void fraudStateNegativeTest(){
             Trader trader1 = new Trader("pokemone", "cидней", "ямайка");
              int moneyAmmount = 1;
              Transaction transaction1 = new Transaction(trader1, moneyAmmount);
              FraudDetector fraudTest = new FraudDetector();
              System.out.print("Fraud state negative test is");
              testResult(!fraudTest.isFraudState(transaction1));
         }

        void fraudRule5PositiveTest() {
             Trader trader1 = new Trader("pokemone", "City1", "Germany");
             int moneyAmmount = 1001;
             Transaction transaction1 = new Transaction(trader1, moneyAmmount);
             FraudDetector fraudTest = new FraudDetector();
             System.out.print("Fraud Rule 5 positive test is");
             testResult(fraudTest.Rule5(transaction1));
        }

         void fraudRule5NegativeTest() {
             Trader trader1 = new Trader("pokemone", "City1", "Japan");
             int moneyAmmount = 1000;
             Transaction transaction1 = new Transaction(trader1, moneyAmmount);
             FraudDetector fraudTest = new FraudDetector();
             System.out.print("Fraud Rule 5 negative test is");
             testResult(!fraudTest.Rule5(transaction1));
         }

    static void testResult(boolean check) {
        if (check) {
            System.out.println(" OK");
        } else {
            System.out.println(" FAIL");
        }
    }

}
