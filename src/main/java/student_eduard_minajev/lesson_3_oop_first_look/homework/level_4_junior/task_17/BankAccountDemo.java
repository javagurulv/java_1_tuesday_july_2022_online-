package student_eduard_minajev.lesson_3_oop_first_look.homework.level_4_junior.task_17;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName(); //здесь было 2ой раз Owner's First Name
        int moneyAmount = bankAccount.getMoneyAmount(); // здесь тоже нужно было String поменять на int
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);
    }
}
