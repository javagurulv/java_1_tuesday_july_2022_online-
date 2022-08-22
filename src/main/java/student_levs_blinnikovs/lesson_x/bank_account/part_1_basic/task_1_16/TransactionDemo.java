package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_16;

class TransactionDemo {
    public static void main(String[] args) {

        Transaction kebabBuyTransaction = new Transaction(4, ExpenseCategory.FOOD);

        Transaction salaryPaymentTransaction = new Transaction(1850);

        Transaction pokerWinPaymentTransaction = new Transaction(580);

        System.out.println(kebabBuyTransaction.getExpenseCategory());
        System.out.println(salaryPaymentTransaction.getExpenseCategory());
        System.out.println(pokerWinPaymentTransaction.getExpenseCategory());

    }
}
