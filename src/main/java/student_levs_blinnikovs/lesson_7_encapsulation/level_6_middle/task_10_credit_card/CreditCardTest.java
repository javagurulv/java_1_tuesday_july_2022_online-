package student_levs_blinnikovs.lesson_7_encapsulation.level_6_middle.task_10_credit_card;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();

        test.shouldCreateCardWithZeroBalance();
        test.shouldCreateCardWithZeroLoanAmount();
        test.shouldCreateCardWithZeroCreditLimit();
        test.shouldSetCreditLimit();

        test.shouldDeclineDepositOverWrongPIN();
        test.shouldDeclineWithdrawalOverWrongPIN();

        test.shouldDeposit();
        test.shouldFailWithdrawal();
        test.shouldAllowWithdrawalUpToTheBalance();
        test.shouldAllowWithdrawalOfTheFullBalance();
        test.shouldNotAllowWithdrawalOfTheMoreThanFullBalance();

        test.shouldWithdrawFromLoanAmount();
    }

    CreditCard createCreditCard() {
        return new CreditCard("5555555555554444", "0000");
    }

    CreditCard createCreditCard(int creditLimit) {
        CreditCard visaCredit = new CreditCard("4012888888881881", "0000");
        visaCredit.setCreditLimit(creditLimit);
        return visaCredit;
    }

    void shouldCreateCardWithZeroBalance() {
        int expectedBalance = 0;
        CreditCard masterCard = this.createCreditCard();
        int realBalance = masterCard.getBalance();
        printTestResult(expectedBalance == realBalance);
    }

    void shouldCreateCardWithZeroLoanAmount() {
        int expectedLoanAmount = 0;
        CreditCard masterCard = createCreditCard();
        int realLoanAmount = masterCard.getLoanAmount();
        printTestResult(expectedLoanAmount == realLoanAmount);
    }

    void shouldCreateCardWithZeroCreditLimit() {
        int expectedCreditLimit = 0;
        CreditCard masterCard = createCreditCard();
        int realCreditLimit = masterCard.getCreditLimit();
        printTestResult(expectedCreditLimit == realCreditLimit);
    }

    void shouldSetCreditLimit() {
        int expectedCreditLimit = 1000;
        CreditCard masterCard = createCreditCard();
        masterCard.setCreditLimit(1000);
        int realCreditLimit = masterCard.getCreditLimit();
        printTestResult(expectedCreditLimit == realCreditLimit);
    }

    void shouldDeclineDepositOverWrongPIN() {
        int expectedBalance = 0;
        CreditCard masterCard = createCreditCard();
        masterCard.deposit("1234", 100);
        int realBalance = masterCard.getBalance();
        printTestResult(expectedBalance == realBalance);
    }

    void shouldDeclineWithdrawalOverWrongPIN() {
        int expectedBalance = 0;
        CreditCard masterCard = createCreditCard();
        masterCard.withdraw("1234", 50);
        int realBalance = masterCard.getBalance();      // this also kinda tests zero balance scenario.. and here can add deposit to test deposit.. but ok
        printTestResult(expectedBalance == realBalance);
    }

    // todo all withdrawal/deposit transaction tests
    // without credit limit
    void shouldDeposit() {
        int expectedBalance = 100;
        CreditCard masterCard = createCreditCard();
        masterCard.deposit("0000", 100);
        int realBalance = masterCard.getBalance();
        printTestResult(expectedBalance == realBalance);
    }

    // try to withdraw from 0 and fail
    void shouldFailWithdrawal() {
        int expectedBalance = 0;
        CreditCard masterCard = createCreditCard();
        masterCard.withdraw("0000", 100);
        int realBalance = masterCard.getBalance();
        printTestResult(expectedBalance == realBalance);
    }

    // add money and withdraw up to the balance
    void shouldAllowWithdrawalUpToTheBalance() {
        int expectedBalance = 900;
        CreditCard masterCard = createCreditCard();
        masterCard.deposit("0000", 1000);
        masterCard.withdraw("0000", 100);
        int realBalance = masterCard.getBalance();
        printTestResult(expectedBalance == realBalance);
    }

    void shouldAllowWithdrawalOfTheFullBalance() {
        int expectedBalance = 0;
        CreditCard masterCard = createCreditCard();
        masterCard.deposit("0000", 1000);
        masterCard.withdraw("0000", 1000);
        int realBalance = masterCard.getBalance();
        printTestResult(expectedBalance == realBalance);
    }

    // add money and try to withdraw more than, fail
    void shouldNotAllowWithdrawalOfTheMoreThanFullBalance() {
        int expectedBalance = 1000;
        CreditCard masterCard = createCreditCard();
        masterCard.deposit("0000", 1000);
        masterCard.withdraw("0000", 1500);
        int realBalance = masterCard.getBalance();
        printTestResult(expectedBalance == realBalance);
    }

    // with credit limit
    // add balance, withdraw from it up to balance
    // withdraw more than balance, validate loan amts
    void shouldWithdrawFromLoanAmount() {
        int expectedLoanAmount = 200;
        CreditCard masterCard = createCreditCard(1000);
        masterCard.withdraw("0000", 200);
        int realLoanAmount = masterCard.getLoanAmount();
        printTestResult(expectedLoanAmount == realLoanAmount);
    }
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

}
