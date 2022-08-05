package student_levs_blinnikovs.lesson_3_oop_first_look.level_4_junior.task_17;

/*
Найти ошибку в коде.
        Исправить и запустить программу.
 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BankAccount {

    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount(String ownerFirstName,
                String ownerLastName, // missing comma
                int moneyAmount) { // was unused attribute
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount; // moneyAmount instead of money
    }

    String getOwnerFirstName() { // missing arg scope
        return this.ownerFirstName; //missing ;
    }

    String getOwnerLastName() { // missing arg scope
        return this.ownerFirstName; // missing ;
    }

    int getMoneyAmount() { // void doesn't return anything, changed to int
        return this.moneyAmount;
    }

}


