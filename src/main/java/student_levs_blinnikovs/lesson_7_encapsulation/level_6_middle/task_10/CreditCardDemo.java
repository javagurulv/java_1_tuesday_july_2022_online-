package student_levs_blinnikovs.lesson_7_encapsulation.level_6_middle.task_10;

class CreditCardDemo {
    public static void main(String[] args) {

        System.out.println("\nMasterCard Debit (no credit limit) demo: ");

        CreditCard masterCard = new CreditCard("5555555555554444", "0000");
        masterCard.setCreditLimit(0);
        masterCard.deposit("0000", 500);
        masterCard.withdraw("0000", 300);
        masterCard.withdraw("0000", 150);
        masterCard.withdraw("0000", 100);
        masterCard.deposit("0000", 50);
        masterCard.withdraw("0000", 100);

        System.out.println("\nVISA Credit demo: ");

        CreditCard visa = new CreditCard("4012888888881881", "0000");
        visa.setCreditLimit(1000);
        masterCard.deposit("0000", 500);
        masterCard.withdraw("0000", 300);
        masterCard.withdraw("0000", 150);
        masterCard.withdraw("0000", 100); // something is wrong here, tbd
        masterCard.withdraw("0000", 50);


    }
}
