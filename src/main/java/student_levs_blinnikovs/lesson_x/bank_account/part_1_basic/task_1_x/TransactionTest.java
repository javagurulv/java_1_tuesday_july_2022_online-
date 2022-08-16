package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_x;

/*
Создайте класс TransactionTest, и протестируйте методы isDeposit() и isWithdrawal().
Для каждого метода напишите два тест кейса, один на позитивный результат,
другой на негативный.
 */

import static student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_x.TransactionType.*;

class TransactionTest {

    public boolean isRealEqualExpected(boolean realData, boolean expectedData) {
        return realData == expectedData;
    }
    public void compareRealExpected(boolean realData, boolean expectedData) {
        if (isRealEqualExpected(realData, expectedData)) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    public void transactionTypeDepositTest() {
        // prepare test data
        Transaction testedTransaction = new Transaction(100, DEPOSIT); // is imported static better than TransactionType.DEPOSIT for example?
        // test steps
        boolean realResult = testedTransaction.isDeposit();
        boolean expectedResult = true;
        // validate
        compareRealExpected(realResult, expectedResult);
    }

    public void transactionTypeDepositTest(boolean expectedResult) {
        // prepare test data
        Transaction testedTransaction = new Transaction(100, DEPOSIT);
        // test steps
        boolean realResult = testedTransaction.isDeposit();
        // validate
        compareRealExpected(realResult, expectedResult);
    }

    public void transactionTypeDepositTest(TransactionType transactionType) {
        // prepare test data
        Transaction testedTransaction = new Transaction(100, transactionType);
        // test steps
        boolean realResult = testedTransaction.isDeposit();
        boolean expectedResult = true;
        // validate
        compareRealExpected(realResult, expectedResult);
    }

    public void transactionTypeDepositTest(TransactionType transactionType, boolean expectedResult) {
        // prepare test data
        Transaction testedTransaction = new Transaction(100, transactionType);
        // test steps
        boolean realResult = testedTransaction.isDeposit();
        // validate
        compareRealExpected(realResult, expectedResult);
    }

    public void transactionTypeWithdrawalTest() {
        // prepare test data
        Transaction testedTransaction = new Transaction(100, WITHDRAWAL);
        // test steps
        boolean realResult = testedTransaction.isWithdrawal();
        boolean expectedResult = true;
        // validate
        compareRealExpected(realResult, expectedResult);
    }

    public void transactionTypeWithdrawalTest(boolean expectedResult) {
        // prepare test data
        Transaction testedTransaction = new Transaction(100, WITHDRAWAL);
        // test steps
        boolean realResult = testedTransaction.isWithdrawal();
        // validate
        compareRealExpected(realResult, expectedResult);
    }

    public void transactionTypeWithdrawalTest(TransactionType transactionType) {
        // prepare test data
        Transaction testedTransaction = new Transaction(100, transactionType);
        // test steps
        boolean realResult = testedTransaction.isWithdrawal();
        boolean expectedResult = true;
        // validate
        compareRealExpected(realResult, expectedResult);
    }

    public void transactionTypeWithdrawalTest(TransactionType transactionType, boolean expectedResult) {
        // prepare test data
        Transaction testedTransaction = new Transaction(100, transactionType);
        // test steps
        boolean realResult = testedTransaction.isWithdrawal();
        // validate
        compareRealExpected(realResult, expectedResult);
    }

    public static void main(String[] args) {

        TransactionTest test = new TransactionTest();

        // simple hardcoded tests - without ability to catch negative test case
        test.transactionTypeDepositTest();
        test.transactionTypeWithdrawalTest();

        // possible to simulate negative test case
        // allow expected to change
        test.transactionTypeDepositTest(true);
        test.transactionTypeWithdrawalTest(true);

        test.transactionTypeDepositTest(false);
        test.transactionTypeWithdrawalTest(false);

        // allow transaction type to change
        test.transactionTypeDepositTest(DEPOSIT); // is imported static better than TransactionType.DEPOSIT for example?
        test.transactionTypeWithdrawalTest(WITHDRAWAL);

        test.transactionTypeDepositTest(WITHDRAWAL);
        test.transactionTypeWithdrawalTest(DEPOSIT);

        // allow both to change
        test.transactionTypeDepositTest(DEPOSIT, true);
        test.transactionTypeWithdrawalTest(WITHDRAWAL, true);

        test.transactionTypeDepositTest(DEPOSIT, false);
        test.transactionTypeWithdrawalTest(WITHDRAWAL, false);

        test.transactionTypeDepositTest(WITHDRAWAL, true);
        test.transactionTypeWithdrawalTest(DEPOSIT, true);

        test.transactionTypeDepositTest(WITHDRAWAL, false);
        test.transactionTypeWithdrawalTest(DEPOSIT, false);

    }

}
