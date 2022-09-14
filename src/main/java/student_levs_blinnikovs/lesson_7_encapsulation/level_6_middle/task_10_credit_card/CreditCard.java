package student_levs_blinnikovs.lesson_7_encapsulation.level_6_middle.task_10_credit_card;

class CreditCard {

    String cardNumber;
    String pinCode;
    int balance;
    int creditLimit;
    int loanAmount;

    boolean isPinCodeOK(String pinCode) {
        return pinCode.equals(this.pinCode);
    }

    boolean isInDebt() {
        return this.loanAmount > 0;
    }

    void deposit(String pinCode, int amount) {
        if (!isPinCodeOK(pinCode)) {
            System.out.println("PIN incorrect! Deposit declined.");
        }
        if (isPinCodeOK(pinCode)) {
            if (isInDebt()) {
                if (amount >= this.loanAmount) {           // isTransactionFullyCoveringDebt(amount)... then some sum needs to be allocated to balance
                    int depositToLoanAmount = this.loanAmount;
                    this.loanAmount -= depositToLoanAmount;
                    int depositToBalance = amount - depositToLoanAmount;
                    this.balance += depositToBalance;         // this.balance += (amount - depositToLoanAmount)
                    System.out.println("Successfully deposited " + depositToLoanAmount + " into loan amount and " + depositToBalance + " into balance. Current loan amount is " + this.loanAmount + " and balance is " + this.balance + ".");
                } else { // otherwise just for loan repayment
                    this.loanAmount -= amount;
                    System.out.println("Successfully deposited " + amount + " into loan amount. Current loan amount is " + this.loanAmount + " and balance is " + this.balance + ".");
                }
            } else if (this.loanAmount == 0) { // alternatively !isInDebt()... but need some checks that loanAmount can't go below 0
                this.balance += amount;
                System.out.println("Successfully deposited " + amount + " into balance. Current balance is " + this.balance + ".");
            }
        }
    }

    void withdraw(String pinCode, int amount) {
        if (!isPinCodeOK(pinCode)) {
            System.out.println("PIN incorrect! Withdrawal declined.");
        }
        if (isPinCodeOK(pinCode)){
            if (this.balance >= amount) {       // isEnoughBalanceForTransaction(amount) ...
                this.balance -= amount;
                System.out.println("Successfully withdrawn " + amount + " from balance. Current balance is " + this.balance + ".");
            } else {
                int withdrawFromBalance = this.balance;                     // may be redundant, left for info messages
                int withdrawFromLoanAmount = amount - withdrawFromBalance;
                if (this.creditLimit >= (this.loanAmount + withdrawFromLoanAmount)) {  // isEnoughCreditLimitForTransaction... something
                    this.balance -= withdrawFromBalance;
                    this.loanAmount += withdrawFromLoanAmount;
                    System.out.println("Successfully withdrawn " + amount + ": " + withdrawFromBalance + " from balance and " + withdrawFromLoanAmount + " from loan amount. Current loan amount is " + this.loanAmount + " and balance is " + this.balance + ".");
                } else if (this.creditLimit < (this.loanAmount + withdrawFromLoanAmount)) {
                    System.out.println("Not enough credit limit (" + this.creditLimit + ") for withdrawal of " + withdrawFromLoanAmount +  ". Loan amount is " + this.loanAmount + ", operation declined!");
                }

            }
        }
    }

    CreditCard(String cardNumber, String pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = 0;
        this.loanAmount = 0;
        this.creditLimit = 0;
    }

    void setCreditLimit(int newCreditLimit) {
        this.creditLimit = newCreditLimit;
    }

    public int getBalance() {
        return balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getLoanAmount() {
        return loanAmount;
    }
}
