package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_16;

class TransactionDemo {
    public static void main(String[] args) {

        // - WITHDRAWAL транзакцию с указанием значения свойства expenseCategory?
        Transaction kebabBuyTransaction = new Transaction(4, ExpenseCategory.FOOD);

        // - DEPOSIT транзакцию без указания значения свойства expenseCategory?
        Transaction salaryPaymentTransaction = new Transaction(1850);

        // - DEPOSIT транзакцию с указанием значения свойства expenseCategory?
        Transaction pokerWinPaymentTransaction = new Transaction(580);

        System.out.println(kebabBuyTransaction.getExpenseCategory());
        System.out.println(salaryPaymentTransaction.getExpenseCategory());
        System.out.println(pokerWinPaymentTransaction.getExpenseCategory());

    }
}
