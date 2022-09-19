package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x;

import static student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x.TestUtil.testResultPrinter;

class FraudRuleAmountTest {

    void shouldBeFraudTransaction(int amount, boolean expectedFraudTransaction) {
        FraudRuleAmount fraudRuleName = new FraudRuleAmount("Amount too high");
        Trader trader = new Trader("Nomekop", "Warsaw", "Poland");
        Transaction transaction = new Transaction(trader, amount);
        boolean realFraudTransaction = fraudRuleName.isFraud(transaction);
        testResultPrinter(expectedFraudTransaction == realFraudTransaction);
    }
    
    public static void main(String[] args) {
        
        FraudRuleAmountTest test = new FraudRuleAmountTest();
        test.shouldBeFraudTransaction(1000001, true);
        test.shouldBeFraudTransaction(1000, false);
        
    }
}
