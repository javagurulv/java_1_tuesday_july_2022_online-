package student_yurii_panasiuk.lesson_7.level_6.task_10;

 class CreditCard {
    private int cardNumber;
    private int pinCode;
    private double creditLimit = 0.0;
    private double balance = 0.0;
    private double loanDebt = 0.0;

     public CreditCard(int cardNumber, int pinCode) {
         this.cardNumber = cardNumber;
         this.pinCode = pinCode;
     }

     public void setBalance(double balance) {
         this.balance = balance;
     }
 }
