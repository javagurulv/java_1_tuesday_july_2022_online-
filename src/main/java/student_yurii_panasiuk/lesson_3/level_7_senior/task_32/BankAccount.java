package student_yurii_panasiuk.lesson_3.level_7_senior.task_32;

/*Найти логическую ошибку в коде.
        Исправить и запустить программу так, что бы она выводила
        на консоль владельца банковского счёта и количество денег.
        Менять можно только класс BankAccount
*/

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BankAccount {

    String owner;
    int money;

    public BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return this.owner;
    }

    double getMoney() {
        return this.money;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        double moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }

}