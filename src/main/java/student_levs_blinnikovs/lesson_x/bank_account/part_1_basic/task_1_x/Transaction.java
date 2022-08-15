package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_x;

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

    Transaction(int amount, TransactionType transactionType){
        this.amount = amount;
        this.transactionType = transactionType;
    }

    private int getAmount() {
        return this.amount;
    }

}
