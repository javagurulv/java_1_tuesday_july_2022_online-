package student_levs_blinnikovs.lesson_7_encapsulation.level_6_middle.task_10;

class CreditCardTest {

    void testResultPrinter(boolean isTestOK) {
        if (isTestOK) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test NOT OK!");
        }
    }

    CreditCard createCreditCard() {
        return new CreditCard("5555555555554444", "0000");
    }

    void shouldCreateCardWithZeroBalance() {
        int expectedBalance = 0;
        CreditCard masterCard = createCreditCard();
        int realBalance = masterCard.balance;
        testResultPrinter(expectedBalance == realBalance);
    }

    void shouldCreateCardWithZeroLoanAmount() {
        int expectedLoanAmount = 0;
        CreditCard masterCard = createCreditCard();
        int realLoanAmount = masterCard.loanAmount;
        testResultPrinter(expectedLoanAmount == realLoanAmount);
    }

    void shouldCreateCardWithZeroCreditLimit() {
        int expectedCreditLimit = 0;
        CreditCard masterCard = createCreditCard();
        int realCreditLimit = masterCard.creditLimit;
        testResultPrinter(expectedCreditLimit == realCreditLimit);
    }

    void shouldSetCreditLimit() {
        int expectedCreditLimit = 1000;
        CreditCard masterCard = createCreditCard();
        masterCard.setCreditLimit(1000);
        int realCreditLimit = masterCard.creditLimit;
        testResultPrinter(expectedCreditLimit == realCreditLimit);
    }

    void shouldDeclineDepositOverWrongPIN() {
        int expectedBalance = 0;
        CreditCard masterCard = createCreditCard();
        masterCard.deposit("1234", 100);
        int realBalance = masterCard.balance;
        testResultPrinter(expectedBalance == realBalance);
    }

    void shouldDeclineWithdrawalOverWrongPIN() {
        int expectedBalance = 100;
        CreditCard masterCard = createCreditCard();
        masterCard.deposit("0000", 100);
        masterCard.withdraw("1234", 50);
        int realBalance = masterCard.balance;
        testResultPrinter(expectedBalance == realBalance);
    }

    // todo all withdrawal/deposit transaction tests
    // without credit limit
    // try to withdraw from 0 and fail
    // add money and withdraw up to the balance
    // add money and try to withdraw more than, fail

    // with credit limit
    // add balance, withdraw from it up to balance
    // withdraw more than balance, validate loan amts
    // withdraw more than balance, more than limit, fail
    // withdraw starting from 0 balance + limit, sucess up to the limit amt
    // withdraw starting from 0 over limit, fail

    // repayment scenarios
    // add from 0 - should add to balance
    // start from 0 into debt, then repay partially
    // start from 0 into debt, repay fully up to 0
    // start from 0 into debt, repay over 0 + to the balance
    // deposit + into debt, then repay partially
    // deposit + into debt, repay fully
    // deposit + into debt, repay over 0 balance

    public static void main(String[] args) {

        CreditCardTest test = new CreditCardTest();

        test.shouldCreateCardWithZeroBalance();
        test.shouldCreateCardWithZeroLoanAmount();
        test.shouldCreateCardWithZeroCreditLimit();
        test.shouldSetCreditLimit();

        test.shouldDeclineDepositOverWrongPIN();
        test.shouldDeclineWithdrawalOverWrongPIN();

    }
}
