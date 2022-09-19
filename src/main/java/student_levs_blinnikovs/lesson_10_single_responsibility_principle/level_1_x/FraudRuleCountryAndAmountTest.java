package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x;

import static student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x.TestUtil.testResultPrinter;

class FraudRuleCountryAndAmountTest {

    void shouldBeFraudTransaction(int amount, boolean expectedFraudTransaction) {
        FraudRuleCountryAndAmount fraudRuleName = new FraudRuleCountryAndAmount("Transactions from Germany over 1000 are not allowed");
        Trader trader = new Trader("Angela Merkel", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, amount);
        boolean realFraudTransaction = fraudRuleName.isFraud(transaction);
        testResultPrinter(expectedFraudTransaction == realFraudTransaction);
    }
    
    public static void main(String[] args) {
        
        FraudRuleCountryAndAmountTest test = new FraudRuleCountryAndAmountTest();
        test.shouldBeFraudTransaction(1100, true);
        test.shouldBeFraudTransaction(200, false);
        
    }
}
