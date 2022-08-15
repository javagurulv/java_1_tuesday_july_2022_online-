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
    public void compareRealExpected(boolean realData, boolean expectedData) {
        if (isRealEqualExpected(realData, expectedData)) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    public void transactionTypeDepositTest(boolean expectedResult) {
        // prepare test data
        Transaction transactionDeposit = new Transaction(100, TransactionType.DEPOSIT);
        // test steps
        boolean realResult = transactionDeposit.isDeposit();
        // validate
        compareRealExpected(realResult, expectedResult);
    }

    public void transactionTypeWithdrawalTest(boolean expectedResult) {
        // prepare test data
        Transaction transactionDeposit = new Transaction(100, TransactionType.WITHDRAWAL);
        // test steps
        boolean realResult = transactionDeposit.isWithdrawal();
        // validate
        compareRealExpected(realResult, expectedResult);
    }

    public static void main(String[] args) {

        TransactionTest test = new TransactionTest();

        test.transactionTypeDepositTest(true);
        test.transactionTypeWithdrawalTest(true);

        test.transactionTypeDepositTest(false);
        test.transactionTypeWithdrawalTest(false);

    }

}
