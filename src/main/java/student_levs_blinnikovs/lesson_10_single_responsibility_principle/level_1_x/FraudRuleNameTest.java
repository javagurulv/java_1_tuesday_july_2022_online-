package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x;

import static student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x.TestUtil.testResultPrinter;

class FraudRuleNameTest {

    void shouldBeFraudTransaction(String traderName, boolean expectedFraudTransaction) {
        FraudRuleName fraudRuleName = new FraudRuleName("Trader named Pokemon");
        Trader trader = new Trader(traderName, "Saransk", "Russia");
        Transaction transaction = new Transaction(trader, 100);
        boolean realFraudTransaction = fraudRuleName.isFraud(transaction);
        testResultPrinter(expectedFraudTransaction == realFraudTransaction);
    }
    
    public static void main(String[] args) {
        
        FraudRuleNameTest test = new FraudRuleNameTest();
        test.shouldBeFraudTransaction("Pokemon", true);
        test.shouldBeFraudTransaction("Nomekop", false);
        
    }
}
