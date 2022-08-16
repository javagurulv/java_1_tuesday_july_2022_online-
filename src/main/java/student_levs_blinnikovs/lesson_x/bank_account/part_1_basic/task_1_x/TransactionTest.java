package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_x;

/*
Создайте класс TransactionTest, и протестируйте методы isDeposit() и isWithdrawal().
Для каждого метода напишите два тест кейса, один на позитивный результат,
другой на негативный.
 */

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

    public void transactionTypeDepositPositiveTest(String scenario) {
        // prepare test data
        Transaction testedTransaction = new Transaction(100, TransactionType.DEPOSIT);
        // test steps
        boolean realResult = testedTransaction.isDeposit();
        // validate
        compareRealExpected(realResult, true, scenario);
    }

    public void transactionTypeWithdrawalPositiveTest(String scenario) {
        // prepare test data
        Transaction testedTransaction = new Transaction(100, TransactionType.WITHDRAWAL);
        // test steps
        boolean realResult = testedTransaction.isWithdrawal();
        boolean expectedResult = true;
        // validate
        compareRealExpected(realResult, expectedResult, scenario);
    }

    public void transactionTypeDepositNegativeTest(String scenario) {
        // prepare test data
        Transaction testedTransaction = new Transaction(100, TransactionType.DEPOSIT);          // is imported static better than TransactionType.DEPOSIT for example?
        // is it better to hide test object prep in a separate method?
        // test steps
        boolean realResult = testedTransaction.isDeposit();
        boolean expectedResult = false;                                                  // is it better to use transactionType getter for it?
        // is it better to hide test steps under method?
        // validate
        compareRealExpected(realResult, expectedResult, scenario);
    }

    public void transactionTypeWithdrawalNegativeTest(String scenario) {
        // prepare test data
        Transaction testedTransaction = new Transaction(100, TransactionType.WITHDRAWAL);
        // test steps
        boolean realResult = testedTransaction.isWithdrawal();
        boolean expectedResult = false;
        // validate
        compareRealExpected(realResult, expectedResult, scenario);
    }

    public static void main(String[] args) {

        TransactionTest test = new TransactionTest();

        // simple hardcoded tests - without ability to catch negative test case
        test.transactionTypeDepositPositiveTest("create DEPOSIT transaction hard way and call deposit test - expect OK");
        test.transactionTypeWithdrawalPositiveTest("create WITHDRAWAL transaction hard way and call withdrawal test - expect OK");

        test.transactionTypeDepositNegativeTest("create DEPOSIT transaction hard way and call deposit test expecting it's false - expect FAIL");
        test.transactionTypeWithdrawalNegativeTest("create WITHDRAWAL transaction hard way and call deposit test expecting it's false - expect FAIL");

    }

}
