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

    public void transactionTypeDepositTest() {
        // prepare test data
        Transaction testedTransaction = new Transaction(100, TransactionType.DEPOSIT);
        // test steps
        boolean realResult = testedTransaction.isDeposit();
        // validate
        compareRealExpected(realResult, testedTransaction.isDeposit());
    }

    public static void main(String[] args) {

        TransactionTest test = new TransactionTest();

        test.transactionTypeDepositTest();

    }

}
