package student_yurii_panasiuk.lesson_7.level_6.task_10;

 class CreditCard {
    private int cardNumber;
    private int pinCode;
    private double creditLimit = 0.0;
    private double balance = 0.0;
    private double loanDebt = 0.0;

     void setCreditLimit(double creditLimit) {
         this.creditLimit = creditLimit;
     }

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

    private void deposit (double depositAmount) {
          if (this.loanDebt == 0)
         this.balance = this.balance+depositAmount;
          else {
              loanRepayment(depositAmount);
          }
    }

    private void withdraw (double withdrawAmount) {
         double depositAmountAfteWithdraw = this.balance;
          if (this.balance >= withdrawAmount) {
             depositAmountAfteWithdraw = this.balance - withdrawAmount;
             this.balance = depositAmountAfteWithdraw;
             }
         else if ((this.creditLimit + this.balance) >= withdrawAmount){
             double creditLimitAfterWithdraw = this.creditLimit - (withdrawAmount - this.balance);
             this.creditLimit = creditLimitAfterWithdraw;
             this.loanDebt = this.loanDebt + withdrawAmount;
             }
         else {
                 withdrawErrorMasage();
             }
     }

    private void loanRepayment (double depositAmount) {
        double depositAmountAfteRepayment = depositAmount; // ясно что переменная лишняя но мне так легче понять
            if (this.loanDebt < depositAmount){
                depositAmountAfteRepayment = depositAmount - loanDebt;
                this.loanDebt = this.loanDebt - depositAmountAfteRepayment;
                this.balance = this.balance + depositAmountAfteRepayment;
                this.creditLimit = this.creditLimit + depositAmountAfteRepayment;
            }
            else {
                this.loanDebt = this.loanDebt - depositAmount;
                this.creditLimit = this.creditLimit + depositAmount;
            }
      }
    private boolean pinCodeCheck (int pinCode){
          return pinCode == this.pinCode;
     }
     private void  pinCodeErrorMasage () {
         System.out.println("WRONG PIN");
     }

     private void  withdrawErrorMasage () {
         System.out.println("INSUFFICIENT FUNDS");
     }

     void withdrawWithPinCode (int pinCode, double withdrawAmount){
         if (pinCodeCheck(pinCode)){
             withdraw(withdrawAmount);
         }
         else {
             withdrawErrorMasage();
         }
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
