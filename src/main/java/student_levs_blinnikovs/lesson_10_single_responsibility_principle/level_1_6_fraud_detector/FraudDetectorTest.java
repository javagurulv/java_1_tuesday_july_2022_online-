package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_6_fraud_detector;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.shouldCatchFraudulentTransactionTest();
        test.shouldNotCatchAsThereAreNoFraudulentTransactionsTest();
        test.shouldNotCatchAsSpecificFraudRuleIsNotCheckedTest();
    }

    void shouldCatchFraudulentTransactionTest() {
        Trader trader = new Trader("Karl Marx", "Dresden", "Germany");
        Transaction transaction = new Transaction(trader, 2000);
        FraudRuleCountryAndAmount fraudRuleCountryAndAmount = new FraudRuleCountryAndAmount("Germany, more than 1000");
        FraudRuleCountry fraudRuleCountry = new FraudRuleCountry("Transactions from Jamaica are not allowed");
        FraudRule[] fraudRules = {fraudRuleCountryAndAmount, fraudRuleCountry};
        FraudDetectionResult expectedExistFraudulentTransactions = new FraudDetectionResult(true, "Germany, more than 1000");
        FraudDetector detector = new FraudDetector(fraudRules);
        FraudDetectionResult realExistFraudulentTransactions = detector.isFraud(transaction);
        printTestResult(expectedExistFraudulentTransactions.equals(realExistFraudulentTransactions));
    }

    void shouldNotCatchAsThereAreNoFraudulentTransactionsTest() {
        Trader trader = new Trader("Karl Marx", "Dresden", "Germany");
        Transaction transaction = new Transaction(trader, 900);
        FraudRuleCountryAndAmount fraudRuleCountryAndAmount = new FraudRuleCountryAndAmount("Germany, more than 1000");
        FraudRuleCountry fraudRuleCountry = new FraudRuleCountry("Transactions from Jamaica are not allowed");
        FraudRule[] fraudRules = {fraudRuleCountryAndAmount, fraudRuleCountry};
        FraudDetectionResult expectedExistFraudulentTransactions = new FraudDetectionResult(false,null);
        FraudDetector detector = new FraudDetector(fraudRules);
        FraudDetectionResult realExistFraudulentTransactions = detector.isFraud(transaction);
        printTestResult(expectedExistFraudulentTransactions.equals(realExistFraudulentTransactions));
    }

    void shouldNotCatchAsSpecificFraudRuleIsNotCheckedTest() {
        Trader trader = new Trader("Karl Marx", "Dresden", "Germany");
        Transaction transaction = new Transaction(trader, 2000);
        FraudRuleCountry fraudRuleCountry = new FraudRuleCountry("Transactions from Jamaica are not allowed");
        FraudRule[] fraudRules = {fraudRuleCountry};
        FraudDetectionResult expectedExistFraudulentTransactions = new FraudDetectionResult(false,null);
        FraudDetector detector = new FraudDetector(fraudRules);
        FraudDetectionResult realExistFraudulentTransactions = detector.isFraud(transaction);
        printTestResult(expectedExistFraudulentTransactions.equals(realExistFraudulentTransactions));
    }

}
