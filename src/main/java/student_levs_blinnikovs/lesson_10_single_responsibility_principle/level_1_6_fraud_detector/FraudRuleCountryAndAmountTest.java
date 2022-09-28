package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_6_fraud_detector;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class FraudRuleCountryAndAmountTest {

    public static void main(String[] args) {
        FraudRuleCountryAndAmountTest test = new FraudRuleCountryAndAmountTest();
        test.shouldBeFraudTransaction(1100, true);
        test.shouldBeFraudTransaction(200, false);
    }

    void shouldBeFraudTransaction(int amount, boolean expectedFraud) {
        Trader trader = new Trader("Angela Merkel", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, amount);
        FraudRuleCountryAndAmount fraudRuleCountryAndAmount = new FraudRuleCountryAndAmount("Transactions from Germany over 1000 are not allowed");
        FraudRule[] fraudRules = {fraudRuleCountryAndAmount};
        FraudDetector detector = new FraudDetector(fraudRules);
        FraudDetectionResult realFraudTransaction = detector.isFraud(transaction);
        boolean realFraud = realFraudTransaction.getFraud();
        printTestResult(expectedFraud == realFraud);
    }

}
