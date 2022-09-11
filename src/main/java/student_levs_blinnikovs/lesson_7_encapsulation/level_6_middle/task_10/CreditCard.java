package student_levs_blinnikovs.lesson_7_encapsulation.level_6_middle.task_10;

class CreditCard {

    String cardNumber;
    String pinCode;
    int balance;
    int creditLimit;
    int loanAmount;

    void deposit(String pinCode, int amount) {
        if (!pinCode.equals(this.pinCode)) {
            System.out.println("PIN incorrect! Deposit declined.");
        }
        if (pinCode.equals(this.pinCode)) {
            if (this.loanAmount > 0) {
                int depositToLoanAmount = this.loanAmount; // may be redundant
                int depositToBalance = amount - depositToLoanAmount;
                this.balance += depositToBalance;
                System.out.println("Successfully deposited " + depositToLoanAmount + " into loan amount and " + depositToBalance + " into balance. Current loan amount is " + this.loanAmount + " and balance is " + this.balance + ".");
            } else if (this.loanAmount == 0) {
                this.balance += amount;
                System.out.println("Successfully deposited " + amount + " into balance. Current balance is " + this.balance + ".");
            }
        }
    }

    void withdraw(String pinCode, int amount) {
        if (!pinCode.equals(this.pinCode)) {
            System.out.println("PIN incorrect! Withdrawal declined.");
        }
        if (pinCode.equals(this.pinCode)){
            if (this.balance >= amount) {
                this.balance -= amount;
                System.out.println("Successfully withdrawn " + amount + " from balance. Current balance is " + this.balance + ".");
            } else if (this.balance < amount) {
                int withdrawFromBalance = this.balance;                     // may be redundant
                int withdrawFromLoanAmount = amount - withdrawFromBalance;
                if (this.creditLimit >= withdrawFromLoanAmount) {           // maybe here need check for if creditLimit >= loanAmount instead.. TBD
                    this.balance -= withdrawFromBalance;                        // might as well just assign 0, but this looks better
                    this.loanAmount -= withdrawFromLoanAmount;
                    System.out.println("Successfully withdrawn " + withdrawFromLoanAmount + " from loan amount and " + withdrawFromBalance + " from balance. Current loan amount is " + this.loanAmount + " and balance is " + this.balance + ".");
                } else if (this.creditLimit < withdrawFromLoanAmount) {      // maybe here need check for if creditLimit < loanAmount instead.. TBD
                    System.out.println("Not enough credit limit, operation declined!");
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
}
