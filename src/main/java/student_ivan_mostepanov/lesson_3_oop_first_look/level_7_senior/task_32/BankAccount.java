package student_ivan_mostepanov.lesson_3_oop_first_look.level_7_senior.task_32;

class BankAccount {

    String owner;
    int money;

    BankAccount(String owner, int money ) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

}
