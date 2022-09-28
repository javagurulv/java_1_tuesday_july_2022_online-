package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_6_fraud_detector;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class FraudRuleCountryTest {

    public static void main(String[] args) {
        FraudRuleCountryTest test = new FraudRuleCountryTest();
        test.shouldBeFraudTransaction("Jamaica", true);
        test.shouldBeFraudTransaction("Fiji", false);
    }

    void shouldBeFraudTransaction(String country, boolean expectedFraud) {
        Trader trader = new Trader("Bob Marley", "Kingston", country);
        Transaction transaction = new Transaction(trader, 100);
        FraudRuleCountry fraudRuleCountry = new FraudRuleCountry("Transactions from Jamaica are not allowed");
        FraudRule[] fraudRules = {fraudRuleCountry};
        FraudDetector detector = new FraudDetector(fraudRules);
        FraudDetectionResult realFraudTransaction = detector.isFraud(transaction);
        boolean realFraud = realFraudTransaction.getFraud();
        printTestResult(expectedFraud == realFraud);
    }
}
