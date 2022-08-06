package student_olegs_radigins.lesson_3.level4.task_17;

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
        return ownerFirstName;
    }

    String getOwnerLastName() {
        return ownerLastName;
    }

    int getMoneyAmount() {
        return moneyAmount;
    }
}
