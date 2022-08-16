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
        int balance = 0;

        // get all transactions, store in some array
        Transaction[] transactions = bankAccount.getTransactions();

        // iterate through all array elements
        for (Transaction transaction : transactions) {
            System.out.println("There were following transactions: ");
            System.out.println(transaction.getTransactionType() + " of " + transaction.getAmount() + " EUR.");
        }

        // check type of TransactionType in each element
        // if DEPOSIT, add amount to balance.
        // if WITHDRAWAl, subtract amount from balance

        // return balance
        return balance;
    }

}
