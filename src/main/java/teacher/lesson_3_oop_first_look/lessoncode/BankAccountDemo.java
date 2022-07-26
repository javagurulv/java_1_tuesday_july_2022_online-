package teacher.lesson_3_oop_first_look.lessoncode;

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor");
        BankAccount alexAccount = new BankAccount("Alex");

        int money = bankAccount.addMoney(1000);
        System.out.println("Money = " + money);

        money = bankAccount.addMoney(1000);
        System.out.println("Money = " + money);

        money = bankAccount.removeMoney(1000);
        System.out.println("Money = " + money);

        money = bankAccount.removeMoney(1000);
        System.out.println("Money = " + money);

        bankAccount.printStatusToConsole();
    }

}
