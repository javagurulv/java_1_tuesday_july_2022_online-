package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_16;

/*
Создайте класс Transaction, который будет представлять из себя
транзакцию которая совершается с банковским счётом.

У транзакции должны быть следующие свойства:
- полное имя владельца транзакции;
- сумма (можно для простоты представить в центах - то есть целым числом);
- тип транзакции (свойство, которое будет хранить значение из enum TransactionType).

class Transaction {

    private int amount;
    private TransactionType transactionType;

    // создайте конструктор класса с двумя параметрами: amount, transactionType.

    // создайте геттер метод для свойства amount

}

 */

class Transaction {

    private String transactionOwner;
    private int amount;
    private TransactionType transactionType;
    private ExpenseCategory expenseCategory;

    Transaction(int amount, TransactionType transactionType, ExpenseCategory expenseCategory){
        this.amount = amount;
        this.transactionType = transactionType;
        this.expenseCategory = expenseCategory;
    }

    Transaction(int amount, TransactionType transactionType) {  // used overloading to be able to set without expense cat
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public int getAmount() {
        return this.amount;
    }

    // создайте метод isDeposit(), данный метод должен возвращать boolean:
    // - true если транзакция является депозитом
    // - false если транзакция не является депозитом

    // создайте метод isWithdrawal(), данный метод должен возвращать boolean:
    // - true если транзакция является снятием денег со счёта
    // - false если транзакция не является снятием денег со счёта

    public boolean isDeposit() {
        return this.transactionType == TransactionType.DEPOSIT;
    }

    public boolean isWithdrawal() {
        return this.transactionType == TransactionType.WITHDRAWAL;
    }

    public ExpenseCategory getExpenseCategory() {
        return this.expenseCategory;
    }


}
