package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_x;

/*
Создаём класс BankAccount.

Этот класс будет представлять банковский аккаунт и хранить все
совершённые с ним транзакции и полное имя владельца.

class BankAccount {

    private String owner;
    private Transaction[] transactions;

    // создайте конструктор класса, который принимает
    // значение свойства owner и массив транзакций
    // и сохраняет его в свойство transactions.

    // создайте get() метод для свойства owner

    // создайте get() метод для свойства transactions

}

На данный момент банковский аккаунт будет хранить только совершённые с ним транзакции
и полное имя владельца. Других свойств создавать нельзя.
 */

class BankAccount {

    private String owner;
    private Transaction[] transactions;
    int creditLimit;

    BankAccount(String owner, int creditLimit, Transaction[] transactions) {
        this.owner = owner;
        this.transactions = transactions;
        this.creditLimit = creditLimit;
    }

    public String getOwner() {
        return this.owner;
    }

    public Transaction[] getTransactions() {
        return this.transactions;
    }

    public int getCreditLimit() {
        return this.creditLimit;
    }

    public boolean hasCreditLimit() {
        return creditLimit > 0;
    }

}
