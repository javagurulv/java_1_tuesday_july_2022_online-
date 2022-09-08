package student_ivan_mostepanov.lesson_3_oop_first_look.task_17_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
    class BankAccount {

        String ownerFirstName;
        String ownerLastName;
        int moneyAmount;

        BankAccount(String ownerFirstName,
                    String ownerLastName,       /*пропущена запятая*/
                int moneyAmount) {
            this.ownerFirstName = ownerFirstName;
            this.ownerLastName = ownerLastName;
            this.moneyAmount = moneyAmount;
        }

        String getOwnerFirstName() {          /*пропущена скобка*/
            return this.ownerFirstName;           /* нету ";" */
        }

        String getOwnerLastName() {           /*пропущена скобка*/
            return this.ownerLastName;         /* поменять ownerFirstName на ownerLastName, нету ";" */
        }

        int getMoneyAmount() {                  /* поменять void на int */
            return this.moneyAmount;
        }
}
