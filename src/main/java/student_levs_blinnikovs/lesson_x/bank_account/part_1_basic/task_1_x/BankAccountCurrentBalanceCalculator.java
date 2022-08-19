package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_x;

// Task 7
/*
Как вы видите банковский аккаунт хранит только транзакции совершённые с ним
за всё время существования. Банковский аккаунт не хранит
в явном виде количество денег, которое на данный момент доступны (текущий баланс).
Единственный способ как узнать текущий баланс
на банковском счете пользователя - это взять за основу, что при создании
банковского аккаунта на нём находится 0 денег и последовательно "накатить"
(выполнить, применить) все транзакции добавляя или отнимая деньги от этой суммы в
зависимости от типа транзакции:
- DEPOSIT - добавляет деньги на счёт,
- WITHDRAWAL - вычитает деньги со счёта.
 */

class BankAccountCurrentBalanceCalculator {

    // реализуйте данный метод, за основу возьмите способ расчёта
    // текущего баланса описанный выше.
    public int calculate(BankAccount bankAccount) {
        // assume balance is 0
        // credit limit has to impact balance from the start. If credit limit exists, assume balance = 0 + creditLimit
        int balance;
        if (!bankAccount.hasCreditLimit()) {
            balance = 0;
        } else {
            balance = bankAccount.getCreditLimit();
        }

        // get all transactions, store in some array
        Transaction[] transactions = bankAccount.getTransactions();

        // iterate through all array elements
        // check type of TransactionType in each element
        // if DEPOSIT, add amount to balance.
        // if WITHDRAWAl, subtract amount from balance
        for (Transaction transaction : transactions) {
            if (transaction.isDeposit()) {
                balance = balance + transaction.getAmount();
            }
            if (transaction.isWithdrawal()) {
                balance = balance - transaction.getAmount();
            }
        }

        // return balance
        return balance;
    }

}
