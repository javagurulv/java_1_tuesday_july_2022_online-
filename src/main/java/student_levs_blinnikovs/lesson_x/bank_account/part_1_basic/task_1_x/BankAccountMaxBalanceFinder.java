package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_x;

/*
Решаем задачу: какая наибольшая сумма денег была у пользователя
на счету за всё время (наибольший текущий баланс)?

Для выполнения этого расчёта создайте новый класс BankAccountMaxBalanceFinder.

class BankAccountMaxBalanceFinder {

    public int find(BankAccount bankAccount) {
        // реализуйте данный метод, за основу возьмите способ расчёта
        // текущего баланса описанный в предыдущих заданиях
        // и адаптируйте его под нахождение максимального значения баланса.
    }

}
 */

class BankAccountMaxBalanceFinder {

    public int find(BankAccount bankAccount) {
        // assume currentBalance is 0
        // credit limit has to impact balance from the start. If credit limit exists, assume balance = 0 + creditLimit
        int currentBalance;
        if (!bankAccount.hasCreditLimit()) {
            currentBalance = 0;
        } else {
            currentBalance = bankAccount.getCreditLimit();
        }

        // assign currentBalance value to maxBalance as it's highest at the moment
        int maxBalance = currentBalance;

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
            if (currentBalance > maxBalance) {
                maxBalance = currentBalance;
            }
        }

        // return maxBalance
        return maxBalance;
    }

}
