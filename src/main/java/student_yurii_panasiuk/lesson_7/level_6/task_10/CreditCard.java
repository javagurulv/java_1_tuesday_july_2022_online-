package student_yurii_panasiuk.lesson_7.level_6.task_10;

 class CreditCard {
    private int cardNumber;
    private int pinCode;
    private double creditLimit = 0.0;
    private double balance = 0.0;
    private double loanDebt = 5.0;

      int getCardNumber() {
         return cardNumber;
     }

      int getPinCode() {
         return pinCode;
     }

      double getCreditLimit() {
         return creditLimit;
     }

      double getBalance() {
         return balance;
     }

      double getLoanDebt() {
         return loanDebt;
     }

     CreditCard(int cardNumber, int pinCode) {
         this.cardNumber = cardNumber;
         this.pinCode = pinCode;
     }

      void deposit (double depositAmount) {
          if (this.loanDebt == 0)
         this.balance = this.balance+depositAmount;
          else {
              loanRepayment(depositAmount);
          }
     }

     void withdraw (double withdrawAmount) {
         if (this.balance >= withdrawAmount) {
             this.balance = this.balance - withdrawAmount;
         }
         else if (this.creditLimit + this.balance) >= withdrawAmount{
             this.creditLimit = this.creditLimit - (this.balance - withdrawAmount)
             this.loanDebt = this.loanDebt + (withdrawAmount - this.balance);
         }
         else {
                 withdrawErrorMasage();
             }
     }

      void loanRepayment (double depositAmount) {
        double depositAmountAfteRepayment = depositAmount;
            if (this.loanDebt < depositAmount){
                depositAmountAfteRepayment = depositAmount - loanDebt;
                this.loanDebt = this.loanDebt - depositAmountAfteRepayment;
                this.balance = this.balance + depositAmountAfteRepayment;
            }
            else {
                this.loanDebt = this.loanDebt - depositAmount;
            }
      }
     boolean pinCodeCheck (int pinCode){
          return pinCode == this.pinCode;
     }
     void  pinCodeErrorMasage () {
         System.out.println("WRONG PIN");
     }

     void  withdrawErrorMasage () {
         System.out.println("INSUFFICIENT FUNDS");
     }

     void depositeWithPinCode (int pinCode, double depositAmount){
          if (pinCodeCheck(pinCode)){
             deposit (depositAmount);
          }
          else {
             pinCodeErrorMasage ();
          }

     }
 }
