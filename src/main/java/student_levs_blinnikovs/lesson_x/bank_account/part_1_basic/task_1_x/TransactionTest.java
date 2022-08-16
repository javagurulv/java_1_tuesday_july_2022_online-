package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_x;

/*
Создайте класс TransactionTest, и протестируйте методы isDeposit() и isWithdrawal().
Для каждого метода напишите два тест кейса, один на позитивный результат,
другой на негативный.
 */

import java.util.function.Function;

import static student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_x.TransactionType.*;

class TransactionTest {

    public boolean isRealEqualExpected(boolean realData, boolean expectedData) {
        return realData == expectedData;
    }
    public void compareRealExpected(boolean realData, boolean expectedData, String scenario) {
        System.out.println("\nScenario: " + scenario + ": ");
        if (isRealEqualExpected(realData, expectedData)) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    public void transactionTypeDepositTest(String scenario) {
        // prepare test data
        Transaction testedTransaction = new Transaction(100, DEPOSIT);          // is imported static better than TransactionType.DEPOSIT for example?
        // test steps
        boolean realResult = testedTransaction.isDeposit();
        boolean expectedResult = true;                                                  // is it better to use transactionType getter for it?
        // validate
        compareRealExpected(realResult, expectedResult, scenario);
    }

    public void transactionTypeDepositTest(String scenario, boolean expectedResult) {
        // prepare test data
        Transaction testedTransaction = new Transaction(100, DEPOSIT);
        // test steps
        boolean realResult = testedTransaction.isDeposit();
        // validate
        compareRealExpected(realResult, expectedResult, scenario);
    }

    public void transactionTypeDepositTest(String scenario, TransactionType transactionType) {
        // prepare test data
        Transaction testedTransaction = new Transaction(100, transactionType);
        // test steps
        boolean realResult = testedTransaction.isDeposit();
        boolean expectedResult = true;
        // validate
        compareRealExpected(realResult, expectedResult, scenario);
    }

    public void transactionTypeDepositTest(String scenario, TransactionType transactionType, boolean expectedResult) {
        // prepare test data
        Transaction testedTransaction = new Transaction(100, transactionType);
        // test steps
        boolean realResult = testedTransaction.isDeposit();
        // validate
        compareRealExpected(realResult, expectedResult, scenario);
    }

    public void transactionTypeWithdrawalTest(String scenario) {
        // prepare test data
        Transaction testedTransaction = new Transaction(100, WITHDRAWAL);
        // test steps
        boolean realResult = testedTransaction.isWithdrawal();
        boolean expectedResult = true;
        // validate
        compareRealExpected(realResult, expectedResult, scenario);
    }

    public void transactionTypeWithdrawalTest(String scenario, boolean expectedResult) {
        // prepare test data
        Transaction testedTransaction = new Transaction(100, WITHDRAWAL);
        // test steps
        boolean realResult = testedTransaction.isWithdrawal();
        // validate
        compareRealExpected(realResult, expectedResult, scenario);
    }

    public void transactionTypeWithdrawalTest(String scenario, TransactionType transactionType) {
        // prepare test data
        Transaction testedTransaction = new Transaction(100, transactionType);
        // test steps
        boolean realResult = testedTransaction.isWithdrawal();
        boolean expectedResult = true;
        // validate
        compareRealExpected(realResult, expectedResult, scenario);
    }

    public void transactionTypeWithdrawalTest(String scenario, TransactionType transactionType, boolean expectedResult) {
        // prepare test data
        Transaction testedTransaction = new Transaction(100, transactionType);
        // test steps
        boolean realResult = testedTransaction.isWithdrawal();
        // validate
        compareRealExpected(realResult, expectedResult, scenario);
    }

    public static void main(String[] args) {

        TransactionTest test = new TransactionTest();

        // simple hardcoded tests - without ability to catch negative test case
        test.transactionTypeDepositTest("create DEPOSIT transaction hard way and call deposit test - expect OK");
        test.transactionTypeWithdrawalTest("create WITHDRAWAL transaction hard way and call withdrawal test - expect OK");

        // possible to simulate negative test case
        // allow expected to change
        test.transactionTypeDepositTest("create DEPOSIT transaction hard way and call deposit test on it expecting it's true - expect OK", true);
        test.transactionTypeWithdrawalTest("create WITHDRAWAL transaction hard way and call withdrawal test on it expecting it's true - expect OK", true);

        test.transactionTypeDepositTest("create DEPOSIT transaction hard way and call deposit test on it expecting it's false - should FAIL", false);
        test.transactionTypeWithdrawalTest("create WITHDRAWAL transaction hard way and call withdrawal test on it expecting it's false - should FAIL", false);

        // allow transaction type to change
        test.transactionTypeDepositTest("create DEPOSIT transaction by passing it and call deposit test on it - expect OK", DEPOSIT); // is imported static better than TransactionType.DEPOSIT for example?
        test.transactionTypeWithdrawalTest("create WITHDRAWAL transaction by passing it and call withdrawal test on it - expect OK", WITHDRAWAL);

        test.transactionTypeDepositTest("create WITHDRAWAL transaction by passing it and call deposit test on it - should FAIL", WITHDRAWAL);
        test.transactionTypeWithdrawalTest("create DEPOSIT transaction by passing it and call withdrawal test on it - should FAIL", DEPOSIT);

        // allow both to change
        test.transactionTypeDepositTest("create DEPOSIT transaction by passing it and call deposit test on it expecting it's true - expect OK", DEPOSIT, true);
        test.transactionTypeWithdrawalTest("create WITHDRAWAL transaction by passing it and call withdrawal test on it expecting it's true - expect OK", WITHDRAWAL, true);

        test.transactionTypeDepositTest("create DEPOSIT transaction by passing it and call deposit test on it expecting it's false - should FAIL", DEPOSIT, false);
        test.transactionTypeWithdrawalTest("create WITHDRAWAL transaction by passing it and call withdrawal test on it expecting it's false - should FAIL", WITHDRAWAL, false);

        test.transactionTypeDepositTest("create WITHDRAWAL transaction by passing it and call deposit test on it expecting it's true - should FAIL", WITHDRAWAL, true); // not good... like false positive
        test.transactionTypeWithdrawalTest("create DEPOSIT transaction by passing it and call withdrawal test on it expecting it's true - should FAIL", DEPOSIT, true);

        test.transactionTypeDepositTest("create WITHDRAWAL transaction by passing it and call deposit test on it expecting it's false - expect OK", WITHDRAWAL, false);
        test.transactionTypeWithdrawalTest("create DEPOSIT transaction by passing it and call withdrawal test on it expecting it's false - expect OK", DEPOSIT, false);

    }

}
