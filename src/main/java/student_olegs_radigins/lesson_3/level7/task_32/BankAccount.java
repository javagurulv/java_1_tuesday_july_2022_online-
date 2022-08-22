package student_olegs_radigins.lesson_3.level7.task_32;

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
