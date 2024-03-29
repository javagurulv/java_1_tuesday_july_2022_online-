package student_levs_blinnikovs.lesson_3_oop_first_look.level_7_senior.task_32;

/*
Найти логическую ошибку в коде.
        Исправить и запустить программу так, что бы она выводила
        на консоль владельца банковского счёта и количество денег.
        Менять можно только класс BankAccount.
*/

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BankAccount {

    String owner;
    int money;

    BankAccount(String owner, int money) { // adding name setting here and change moneyAmount to money
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {  // change return type
        return this.money;
    }

}


