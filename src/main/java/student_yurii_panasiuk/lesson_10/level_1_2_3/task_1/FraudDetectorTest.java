package student_yurii_panasiuk.lesson_10.level_1_2_3.task_1;

public class FraudDetectorTest {

    public static void main(String[] args) {

        FraudDetectorTest test = new FraudDetectorTest();

        test.fraudNickPositiveTest();
        test.fraudNickNegativeTest();

        test.fraudMaximumAmountPositiveTest();
        test.fraudMaximumAmountNegatigeTest();

        test.fraudCityPositiveTest();
        test.fraudCityNegativeTest();

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
             Trader trader1 = new Trader("Pokemone", "Сидней");
             int moneyAmmount = 1;
             Transaction transaction1 = new Transaction(trader1, moneyAmmount);
             FraudDetector fraudTest = new FraudDetector();
             System.out.print("Fraud city positive test is");
             testResult(fraudTest.isFraudCity(transaction1));
         }

         void fraudCityNegativeTest(){
              Trader trader1 = new Trader("Pokemone", "cидней");
              int moneyAmmount = 1;
              Transaction transaction1 = new Transaction(trader1, moneyAmmount);
              FraudDetector fraudTest = new FraudDetector();
              System.out.print("Fraud city negative test is");
              testResult(!fraudTest.isFraudCity(transaction1));
         }

    static void testResult(boolean check) {
        if (check) {
            System.out.println(" OK");
        } else {
            System.out.println(" FAIL");
        }
    }

}
