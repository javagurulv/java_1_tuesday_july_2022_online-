package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_6_fraud_detector;

import static student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_6_fraud_detector.TestUtil.testResultPrinter;

class FraudRuleNameTest {

    void shouldBeFraudTransaction(String traderName, boolean expectedFraud) {
        Trader trader = new Trader(traderName, "Saransk", "Russia");
        Transaction transaction = new Transaction(trader, 100);
        FraudRuleName fraudRuleName = new FraudRuleName("Trader named Pokemon");
        FraudRule[] fraudRules = {fraudRuleName};
        FraudDetector detector = new FraudDetector(fraudRules);
        FraudDetectionResult realFraudTransaction = detector.isFraud(transaction);
        boolean realFraud = realFraudTransaction.getFraud();
        testResultPrinter(expectedFraud == realFraud);
    }
    
    public static void main(String[] args) {
        
        FraudRuleNameTest test = new FraudRuleNameTest();
        test.shouldBeFraudTransaction("Pokemon", true);
        test.shouldBeFraudTransaction("Nomekop", false);
        
    }
}
