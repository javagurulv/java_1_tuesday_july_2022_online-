package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x;

import static student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x.TestUtil.testResultPrinter;

class FraudRuleCityTest {

    void shouldBeFraudTransaction(String city, boolean expectedFraudTransaction) {
        FraudRuleCity fraudRuleName = new FraudRuleCity("Transactions from Sydney are not allowed");
        Trader trader = new Trader("Aussie", city, "Australia");
        Transaction transaction = new Transaction(trader, 100);
        boolean realFraudTransaction = fraudRuleName.isFraud(transaction);
        testResultPrinter(expectedFraudTransaction == realFraudTransaction);
    }
    
    public static void main(String[] args) {
        
        FraudRuleCityTest test = new FraudRuleCityTest();
        test.shouldBeFraudTransaction("Sydney", true);
        test.shouldBeFraudTransaction("Canberra", false);
        
    }
}
