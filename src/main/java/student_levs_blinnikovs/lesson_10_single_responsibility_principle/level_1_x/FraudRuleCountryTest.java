package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x;

import static student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x.TestUtil.testResultPrinter;

class FraudRuleCountryTest {

    void shouldBeFraudTransaction(String country, boolean expectedFraud) {
        Trader trader = new Trader("Bob Marley", "Kingston", country);
        Transaction transaction = new Transaction(trader, 100);
        FraudRuleCountry fraudRuleCountry = new FraudRuleCountry("Transactions from Jamaica are not allowed");
        FraudRule[] fraudRules = {fraudRuleCountry};
        FraudDetector detector = new FraudDetector(fraudRules);
        FraudDetectionResult realFraudTransaction = detector.isFraud(transaction);
        boolean realFraud = realFraudTransaction.getFraud();
        testResultPrinter(expectedFraud == realFraud);
    }
    
    public static void main(String[] args) {
        
        FraudRuleCountryTest test = new FraudRuleCountryTest();
        test.shouldBeFraudTransaction("Jamaica", true);
        test.shouldBeFraudTransaction("Fiji", false);
        
    }
}
