package student_levs_blinnikovs.lesson_7_encapsulation.level_6_middle.task_10;

class CreditCard {

    String cardNumber;
    String codePIN;
    int balance;
    int creditLimit;
    int loanOverdraft;

    void deposit() {

    }

    void withdraw() {

    }

    CreditCard(String cardNumber, String codePIN) {
        this.cardNumber = cardNumber;
        this.codePIN = codePIN;
        this.balance = 0;
        this.loanOverdraft = 0;
    }

    void setCreditLimit(int newCreditLimit) {
        this.creditLimit = newCreditLimit;
    }

    void increaseCreditLimit(int creditLimitDelta) {
        this.creditLimit += creditLimitDelta;
    }

}
