package student_sobit_eshniyozov.lesson_3_oop_first_look.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BankAccount {
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
