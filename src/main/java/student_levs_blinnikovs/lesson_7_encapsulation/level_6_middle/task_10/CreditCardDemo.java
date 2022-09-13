package student_levs_blinnikovs.lesson_7_encapsulation.level_6_middle.task_10;

class CreditCardDemo {
    public static void main(String[] args) {

        System.out.println("\nMasterCard Debit (no credit limit) demo: ");

        CreditCard masterCard = new CreditCard("5555555555554444", "0000");
        masterCard.setCreditLimit(0);
        masterCard.deposit("1234", 2500);
        masterCard.deposit("0000", 500);
        masterCard.withdraw("0000", 300);
        masterCard.withdraw("0000", 150);
        masterCard.withdraw("0000", 100);
        masterCard.deposit("0000", 50);
        masterCard.withdraw("0000", 100);

        System.out.println("\nVISA Credit demo: ");

        CreditCard visa = new CreditCard("4012888888881881", "0000");
        visa.setCreditLimit(1000);
        visa.deposit("0000", 500);
        visa.withdraw("0000", 300);
        visa.withdraw("0000", 500);
        visa.withdraw("0000", 600);
        visa.withdraw("0000", 200);
        visa.withdraw("0000", 100);
        visa.deposit("0000", 1500);
        visa.withdraw("0000", 750);
        visa.deposit("0000", 250);
        visa.withdraw("0000", 300);
        visa.deposit("0000", 100);
        visa.deposit("0000", 250);


    }
}
