package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x;

import static student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x.TestUtil.testResultPrinter;

class FraudDetectorTest {

    void shouldCatchFraudulentTransactionTest() {
        Trader trader = new Trader("Karl Marx", "Dresden", "Germany");
        Transaction transaction = new Transaction(trader, 2000);
        FraudRuleCountryAndAmount fraudRuleCountryAndAmount = new FraudRuleCountryAndAmount("Germany, more than 1000");
        FraudRuleCountry fraudRuleCountry = new FraudRuleCountry("Transactions from Jamaica are not allowed");
        FraudRule[] fraudRules = {fraudRuleCountryAndAmount, fraudRuleCountry};
        boolean expectedExistFraudulentTransactions = true;
        FraudDetector detector = new FraudDetector(fraudRules);
        boolean realExistFraudulentTransactions = detector.isFraud(transaction);
        testResultPrinter(expectedExistFraudulentTransactions == realExistFraudulentTransactions);
    }

    void shouldNotCatchAsThereAreNoFraudulentTransactionsTest() {
        Trader trader = new Trader("Karl Marx", "Dresden", "Germany");
        Transaction transaction = new Transaction(trader, 900);
        FraudRuleCountryAndAmount fraudRuleCountryAndAmount = new FraudRuleCountryAndAmount("Germany, more than 1000");
        FraudRuleCountry fraudRuleCountry = new FraudRuleCountry("Transactions from Jamaica are not allowed");
        FraudRule[] fraudRules = {fraudRuleCountryAndAmount, fraudRuleCountry};
        boolean expectedExistFraudulentTransactions = false;
        FraudDetector detector = new FraudDetector(fraudRules);
        boolean realExistFraudulentTransactions = detector.isFraud(transaction);
        testResultPrinter(expectedExistFraudulentTransactions == realExistFraudulentTransactions);
    }

    void shouldNotCatchAsFraudRuleIsNotCheckedTest() {
        Trader trader = new Trader("Karl Marx", "Dresden", "Germany");
        Transaction transaction = new Transaction(trader, 900);
        FraudRuleCountry fraudRuleCountry = new FraudRuleCountry("Transactions from Jamaica are not allowed");
        FraudRule[] fraudRules = {fraudRuleCountry};
        boolean expectedExistFraudulentTransactions = false;
        FraudDetector detector = new FraudDetector(fraudRules);
        boolean realExistFraudulentTransactions = detector.isFraud(transaction);
        testResultPrinter(expectedExistFraudulentTransactions == realExistFraudulentTransactions);
    }



    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.shouldCatchFraudulentTransactionTest();
        test.shouldNotCatchAsThereAreNoFraudulentTransactionsTest();
        test.shouldNotCatchAsFraudRuleIsNotCheckedTest();
    }

}
