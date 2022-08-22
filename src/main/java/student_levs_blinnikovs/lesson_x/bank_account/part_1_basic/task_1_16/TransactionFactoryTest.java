package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_16;

class TransactionFactoryTest {

    boolean compareRealExpected(boolean realResult, boolean expectedResult) {
        return realResult == expectedResult;
    }

    void createDepositTransactionTest() {
        Transaction depositTestTransaction = TransactionFactory.createDepositTransaction(100);
        boolean expectedIsDepositTransaction = true;
        boolean realIsDepositTransaction = depositTestTransaction.isDeposit();
        if (compareRealExpected(realIsDepositTransaction, expectedIsDepositTransaction)) {
            System.out.println("Deposit transaction factory test OK");
        } else {
            System.out.println("Deposit transaction factory test NOT OK");
        }
    }

    void createWithdrawalTransaction() {
        Transaction withdrawalTestTransaction = TransactionFactory.createWithdrawalTransaction(200, ExpenseCategory.OTHERS);
        boolean expectedIsWithdrawalTransaction = true;
        boolean realIsWithdrawalTransaction = withdrawalTestTransaction.isWithdrawal();
        if (compareRealExpected(realIsWithdrawalTransaction, expectedIsWithdrawalTransaction)) {
            System.out.println("Withdrawal transaction factory test OK");
        } else {
            System.out.println("Withdrawal transaction factory test NOT OK");
        }
    }

    public static void main(String[] args) {

        TransactionFactoryTest test = new TransactionFactoryTest();

        test.createDepositTransactionTest();
        test.createWithdrawalTransaction();

    }

}
