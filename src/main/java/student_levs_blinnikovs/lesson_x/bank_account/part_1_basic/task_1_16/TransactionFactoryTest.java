package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_16;

class TransactionFactoryTest {

    boolean compareRealExpected(boolean realResult, boolean expectedResult) {
        return realResult == expectedResult;
    }

    String prepareTestResult(boolean isTestOK) {
        String testString = "Transaction factory test is ";
        return isTestOK ? testString + "OK" : testString + "NOT OK";
    }

    void printTestResults(String testResult) {
        System.out.println(testResult);
    }

    void createDepositTransactionTest() {
        printTestResults(prepareTestResult(compareRealExpected(TransactionFactory.createDepositTransaction(100).isDeposit(), true)));
    }

    void createWithdrawalTransaction() {
        printTestResults(prepareTestResult(compareRealExpected(TransactionFactory.createWithdrawalTransaction(200, ExpenseCategory.OTHERS).isWithdrawal(), true)));
    }

    public static void main(String[] args) {

        TransactionFactoryTest test = new TransactionFactoryTest();

        test.createDepositTransactionTest();
        test.createWithdrawalTransaction();

    }

}
