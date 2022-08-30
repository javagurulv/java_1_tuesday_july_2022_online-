package student_ivan_mostepanov.lesson_3_oop_first_look.level_7_senior.task_32;

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();
        /* !Менять можно только класс BankAccount!   Сломало мозг :) Или можно по другому? */
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }

}
