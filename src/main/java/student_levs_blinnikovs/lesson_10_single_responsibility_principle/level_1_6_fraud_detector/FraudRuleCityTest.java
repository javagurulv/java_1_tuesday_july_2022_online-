package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_6_fraud_detector;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;
class FraudRuleCityTest {

    public static void main(String[] args) {
        FraudRuleCityTest test = new FraudRuleCityTest();
        test.shouldBeFraudTransaction("Sydney", true);
        test.shouldBeFraudTransaction("Canberra", false);
    }

    void shouldBeFraudTransaction(String city, boolean expectedFraud) {
        Trader trader = new Trader("Aussie", city, "Australia");
        Transaction transaction = new Transaction(trader, 100);
        FraudRuleCity fraudRuleCity = new FraudRuleCity("Transactions from Sydney are not allowed");
        FraudRule[] fraudRules = {fraudRuleCity};
        FraudDetector detector = new FraudDetector(fraudRules);
        FraudDetectionResult realFraudTransaction = detector.isFraud(transaction);
        boolean realFraud = realFraudTransaction.getFraud();
        printTestResult(expectedFraud == realFraud);
    }

}
