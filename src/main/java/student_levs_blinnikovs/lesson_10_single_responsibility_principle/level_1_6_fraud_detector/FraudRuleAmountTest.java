package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_6_fraud_detector;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class FraudRuleAmountTest {

    public static void main(String[] args) {
        FraudRuleAmountTest test = new FraudRuleAmountTest();
        test.shouldBeFraudTransaction(1000001, true);
        test.shouldBeFraudTransaction(1000, false);
    }

    void shouldBeFraudTransaction(int amount, boolean expectedFraud) {
        Trader trader = new Trader("Nomekop", "Warsaw", "Poland");
        Transaction transaction = new Transaction(trader, amount);
        FraudRuleAmount fraudRuleAmount = new FraudRuleAmount("Amount too high");
        FraudRule[] fraudRules = {fraudRuleAmount};
        FraudDetector detector = new FraudDetector(fraudRules);
        FraudDetectionResult realFraudTransaction = detector.isFraud(transaction);
        boolean realFraud = realFraudTransaction.getFraud();
        printTestResult(expectedFraud == realFraud) ;
    }

}
