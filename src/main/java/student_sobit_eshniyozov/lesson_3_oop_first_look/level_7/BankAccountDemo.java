package student_sobit_eshniyozov.lesson_3_oop_first_look.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }

}
