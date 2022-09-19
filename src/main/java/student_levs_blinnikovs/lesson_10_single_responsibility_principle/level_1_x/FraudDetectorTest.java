package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x;

class FraudDetectorTest {

    void shouldBeFraudTransactionForTraderPokemonTest() {
        FraudDetector detector = new FraudDetector();
        Trader fraudster = new Trader("Pokemon", "Saransk", "Russia");
        Transaction fraudTransaction = new Transaction(fraudster, 100);
        boolean expectedFraudTransaction = true;
        boolean realFraudTransaction = detector.isFraud(fraudTransaction);
        testResultPrinter(expectedFraudTransaction == realFraudTransaction);
    }

    void shouldNotBeFraudTransactionTest() {
        FraudDetector detector = new FraudDetector();
        Trader legalTrader = new Trader("Nomekop", "Warsaw", "Poland");
        Transaction transaction = new Transaction(legalTrader, 100);
        boolean expectedFraudTransaction = false;
        boolean realFraudTransaction = detector.isFraud(transaction);
        testResultPrinter(expectedFraudTransaction == realFraudTransaction);
    }

    void shouldBeFraudTransactionAboveMaxAmountTest() {
        FraudDetector detector = new FraudDetector();
        Trader legalTrader = new Trader("Nomekop", "Warsaw", "Poland");
        Transaction highTransaction = new Transaction(legalTrader, 1000001);
        boolean expectedFraudTransaction = true;
        boolean realFraudTransaction = detector.isFraud(highTransaction);
        testResultPrinter(expectedFraudTransaction == realFraudTransaction);
    }

    void shouldBeFraudTransactionFromSydneyTest() {
        FraudDetector detector = new FraudDetector();
        Trader fromIllegalCity = new Trader("Aussie", "Sydney", "Australia");
        Transaction transaction = new Transaction(fromIllegalCity, 100);
        boolean expectedFraudTransaction = true;
        boolean realFraudTransaction = detector.isFraud(transaction);
        testResultPrinter(expectedFraudTransaction == realFraudTransaction);
    }

    void shouldBeFraudTransactionFromJamaicaTest() {
        FraudDetector detector = new FraudDetector();
        Trader fromIllegalCountry = new Trader("Bob Marley", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(fromIllegalCountry, 100);
        boolean expectedFraudTransaction = true;
        boolean realFraudTransaction = detector.isFraud(transaction);
        testResultPrinter(expectedFraudTransaction == realFraudTransaction);
    }

    void shouldBeFraudTransactionMoreThanAmountFromGermanyTest() {
        FraudDetector detector = new FraudDetector();
        Trader fromIllegalCountry = new Trader("Angela Merkel", "Berlin", "Germany");
        Transaction tooHighTransaction = new Transaction(fromIllegalCountry, 2000);
        boolean expectedFraudTransaction = true;
        boolean realFraudTransaction = detector.isFraud(tooHighTransaction);
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
        test.shouldNotBeFraudTransactionTest();
        test.shouldBeFraudTransactionAboveMaxAmountTest();
        test.shouldBeFraudTransactionFromSydneyTest();
        test.shouldBeFraudTransactionFromJamaicaTest();
        test.shouldBeFraudTransactionMoreThanAmountFromGermanyTest();
    }

}
