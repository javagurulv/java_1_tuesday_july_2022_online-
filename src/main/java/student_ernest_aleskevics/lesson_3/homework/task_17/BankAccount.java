package student_ernest_aleskevics.lesson_3.homework.task_17;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BankAccount {
    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    String getOwnerFirstName() {
        return this.ownerFirstName;
    }

    String getOwnerLastName() {
        return this.ownerFirstName;
    }

    int getMoneyAmount() {
        return this.moneyAmount;
    }

}
