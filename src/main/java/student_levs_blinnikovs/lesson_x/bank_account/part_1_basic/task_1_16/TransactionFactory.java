package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_16;

class TransactionFactory {

    public static Transaction createDepositTransaction(int amount) {
        return new Transaction(amount);
    }

    public static Transaction createWithdrawalTransaction(int amount, ExpenseCategory expenseCategory) {
        return new Transaction(amount, expenseCategory);
    }

}
