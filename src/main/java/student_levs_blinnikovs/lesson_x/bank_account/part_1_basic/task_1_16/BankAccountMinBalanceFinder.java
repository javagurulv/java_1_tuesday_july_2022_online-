package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_16;

/*
Решаем задачу: какая наименьшая сумма денег была у пользователя
на счету за всё время (наименьший текущий баланс)?

Этот вопрос стал особо актуальным после введения кредитного лимита.
Если пользователь пользуется кредитным лимитом, то наименьшая сумма
денег у него на счету будет отрицательной.

Для выполнения этого расчёта создайте новый классе BankAccountMinBalanceFinder.

class BankAccountMinBalanceFinder {

    public int find(BankAccount bankAccount) {
        // реализуйте данный метод, за основу возьмите способ расчёта
        // текущего баланса описанный в предыдущих заданиях
        // и адаптируйте его под нахождение минимального заначения баланса.
    }

}
 */

class BankAccountMinBalanceFinder {

    public int find(BankAccount bankAccount) {
        // assume currentBalance is 0
        int currentBalance;
        if (!bankAccount.hasCreditLimit()) {
            currentBalance = 0;
        } else {
            currentBalance = bankAccount.getCreditLimit();
        }

        // assign currentBalance value to maxBalance as it's highest at the moment
        int minBalance = currentBalance;

        // get all transactions, store in some array
        Transaction[] transactions = bankAccount.getTransactions();

        // iterate through all array elements
        // check type of TransactionType in each element
        // if DEPOSIT, add amount to balance.
        // if this is highest so far, assign value to maxBalance. To check if this is highest, compare with previous highest.
        // if WITHDRAWAl, subtract amount from balance
        for (Transaction transaction : transactions) {
            if (transaction.isDeposit()) {
                currentBalance = currentBalance + transaction.getAmount();
            }
            if (transaction.isWithdrawal()) {
                currentBalance = currentBalance - transaction.getAmount();
            }
            if (currentBalance < minBalance) {
                minBalance = currentBalance;
            }
        }
        return minBalance;
    }

}
