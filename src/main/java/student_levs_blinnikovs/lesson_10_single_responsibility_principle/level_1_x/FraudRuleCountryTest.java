package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x;

import static student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x.TestUtil.testResultPrinter;

class FraudRuleCountryTest {

    void shouldBeFraudTransaction(String country, boolean expectedFraudTransaction) {
        FraudRuleCountry fraudRuleName = new FraudRuleCountry("Transactions from Jamaica are not allowed");
        Trader trader = new Trader("Bob Marley", "Kingston", country);
        Transaction transaction = new Transaction(trader, 100);
        boolean realFraudTransaction = fraudRuleName.isFraud(transaction);
        testResultPrinter(expectedFraudTransaction == realFraudTransaction);
    }
    
    public static void main(String[] args) {
        
        FraudRuleCountryTest test = new FraudRuleCountryTest();
        test.shouldBeFraudTransaction("Jamaica", true);
        test.shouldBeFraudTransaction("Fiji", false);
        
    }
}
