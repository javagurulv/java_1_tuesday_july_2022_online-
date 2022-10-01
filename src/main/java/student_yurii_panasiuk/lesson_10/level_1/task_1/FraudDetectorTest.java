package student_yurii_panasiuk.lesson_10.level_1.task_1;

public class FraudDetectorTest {

    public static void main(String[] args) {

        FraudDetectorTest test = new FraudDetectorTest();
        test.fraudpositivetest();
        test.fraudpnegativetest();

    }


         void fraudpositivetest(){
            Trader trader1 = new Trader("Pokemone", "City1");
            int moneyAmmount = 1;
            Transaction transaction1 = new Transaction(trader1, moneyAmmount);
            FraudDetector fraudTest = new FraudDetector();
            System.out.print("Fraud positive test is");
            testResult(fraudTest.isFraud(transaction1));
        }

         void fraudpnegativetest(){
            Trader trader1 = new Trader("pokemone", "City1");
            int moneyAmmount = 1;
            Transaction transaction1 = new Transaction(trader1, moneyAmmount);
            FraudDetector fraudTest = new FraudDetector();
            System.out.print("Fraud negative test is");
            testResult(!fraudTest.isFraud(transaction1));
        }

    static void testResult(boolean check) {
        if (check) {
            System.out.println(" OK");
        } else {
            System.out.println(" FAIL");
        }
    }

}
