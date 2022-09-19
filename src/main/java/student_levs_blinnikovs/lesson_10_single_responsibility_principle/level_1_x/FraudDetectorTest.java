package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x;

class FraudDetectorTest {

    void shouldBeFraudTransactionForTraderPokemonTest() {
        FraudDetector detector = new FraudDetector();
        Trader fraudster = new Trader("Pokemon", "Saransk");
        Transaction fraudTransaction = new Transaction(fraudster, 100);
        boolean expectedFraudTransaction = true;
        boolean realFraudTransaction = detector.isFraud(fraudTransaction);
        testResultPrinter(expectedFraudTransaction == realFraudTransaction);
    }

    void shouldNotBeFraudTransactionForOtherTraderTest() {
        FraudDetector detector = new FraudDetector();
        Trader legal = new Trader("Nomekop", "Warsaw");
        Transaction transaction = new Transaction(legal, 100);
        boolean expectedFraudTransaction = false;
        boolean realFraudTransaction = detector.isFraud(transaction);
        testResultPrinter(expectedFraudTransaction == realFraudTransaction);
    }

    void testResultPrinter(boolean isTestOK) {
        if (isTestOK) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test NOT OK!");
        }
    }

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.shouldBeFraudTransactionForTraderPokemonTest();
        test.shouldNotBeFraudTransactionForOtherTraderTest();
    }

}
