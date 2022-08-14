package student_eduard_minajev.lesson_3_oop_first_look.homework.level_7_senior.task_32;

public class BankAccount {

    String owner;

    int money;

    BankAccount(String owner, int money) {
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
