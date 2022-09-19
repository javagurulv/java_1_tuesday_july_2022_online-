package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x;

import static student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x.TestUtil.testResultPrinter;

class FraudDetectorTest {

    void shouldCatchFraudulentTransactionTest() {
        Trader trader = new Trader("Karl Marx", "Dresden", "Germany");
        Transaction transaction = new Transaction(trader, 2000);
        FraudRuleCountryAndAmount fraudRuleCountryAndAmount = new FraudRuleCountryAndAmount("Germany, more than 1000");
        FraudRuleCountry fraudRuleCountry = new FraudRuleCountry("Transactions from Jamaica are not allowed");
        FraudRule[] fraudRules = {fraudRuleCountryAndAmount, fraudRuleCountry};
        FraudDetectionResult expectedExistFraudulentTransactions = new FraudDetectionResult(true, "Germany, more than 1000");
        boolean expectedFraud = expectedExistFraudulentTransactions.getFraud();
        String expectedRuleName = expectedExistFraudulentTransactions.getRuleName();
        FraudDetector detector = new FraudDetector(fraudRules);
        FraudDetectionResult realExistFraudulentTransactions = detector.isFraud(transaction);
        boolean realFraud = realExistFraudulentTransactions.getFraud();
        String realRuleName = realExistFraudulentTransactions.getRuleName();
        testResultPrinter((expectedFraud == realFraud) && expectedRuleName.equals(realRuleName)); // todo - I didn't quite get how to compare 2 objects each having 2 attrs
    }

    void shouldNotCatchAsThereAreNoFraudulentTransactionsTest() {
        Trader trader = new Trader("Karl Marx", "Dresden", "Germany");
        Transaction transaction = new Transaction(trader, 900);
        FraudRuleCountryAndAmount fraudRuleCountryAndAmount = new FraudRuleCountryAndAmount("Germany, more than 1000");
        FraudRuleCountry fraudRuleCountry = new FraudRuleCountry("Transactions from Jamaica are not allowed");
        FraudRule[] fraudRules = {fraudRuleCountryAndAmount, fraudRuleCountry};
        FraudDetectionResult expectedExistFraudulentTransactions = new FraudDetectionResult(false,null);
        boolean expectedFraud = expectedExistFraudulentTransactions.getFraud();
        FraudDetector detector = new FraudDetector(fraudRules);
        FraudDetectionResult realExistFraudulentTransactions = detector.isFraud(transaction);
        boolean realFraud = realExistFraudulentTransactions.getFraud();
        testResultPrinter(expectedFraud == realFraud);
    }

    void shouldNotCatchAsSpecificFraudRuleIsNotCheckedTest() {
        Trader trader = new Trader("Karl Marx", "Dresden", "Germany");
        Transaction transaction = new Transaction(trader, 2000);
        FraudRuleCountry fraudRuleCountry = new FraudRuleCountry("Transactions from Jamaica are not allowed");
        FraudRule[] fraudRules = {fraudRuleCountry};
        FraudDetectionResult expectedExistFraudulentTransactions = new FraudDetectionResult(false, null);
        boolean expectedFraud = expectedExistFraudulentTransactions.getFraud();
        FraudDetector detector = new FraudDetector(fraudRules);
        FraudDetectionResult realExistFraudulentTransactions = detector.isFraud(transaction);
        boolean realFraud = realExistFraudulentTransactions.getFraud();
        testResultPrinter(expectedFraud == realFraud);
    }



    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.shouldCatchFraudulentTransactionTest();
        test.shouldNotCatchAsThereAreNoFraudulentTransactionsTest();
        test.shouldNotCatchAsSpecificFraudRuleIsNotCheckedTest();
    }

}
