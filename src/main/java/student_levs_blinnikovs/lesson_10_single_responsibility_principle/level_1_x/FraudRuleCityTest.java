package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x;

import static student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x.TestUtil.testResultPrinter;

class FraudRuleCityTest {

    void shouldBeFraudTransaction(String city, boolean expectedFraud) {
        Trader trader = new Trader("Aussie", city, "Australia");
        Transaction transaction = new Transaction(trader, 100);
        FraudRuleCity fraudRuleCity = new FraudRuleCity("Transactions from Sydney are not allowed");
        FraudRule[] fraudRules = {fraudRuleCity};
        FraudDetector detector = new FraudDetector(fraudRules);
        FraudDetectionResult realFraudTransaction = detector.isFraud(transaction);
        boolean realFraud = realFraudTransaction.getFraud();
        testResultPrinter(expectedFraud == realFraud);
    }
    
    public static void main(String[] args) {
        
        FraudRuleCityTest test = new FraudRuleCityTest();
        test.shouldBeFraudTransaction("Sydney", true);
        test.shouldBeFraudTransaction("Canberra", false);
        
    }
}
