package student_eduard_minajev.lesson_3_oop_first_look.homework.level_7_senior.task_32;

public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney(); // без замены String на int программу нельзя запустить
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }
}
