package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_x;

class BankAccountCurrentBalanceCalculatorTest {

    public static void main(String[] args) {

        // create transactions
        Transaction salaryPayment = new Transaction(1200, TransactionType.DEPOSIT);
        Transaction rentPayment = new Transaction(350, TransactionType.WITHDRAWAL);
        Transaction gasPayment = new Transaction(150, TransactionType.WITHDRAWAL);
        Transaction taxReturnPayment = new Transaction(300, TransactionType.DEPOSIT);
        // expected to have 1k at the end

        // saving all transactions to an array
        Transaction[] finalBalance = {salaryPayment, rentPayment, gasPayment, taxReturnPayment};

        // pass bank account owner and finalBalance array
        BankAccount bankAccount = new BankAccount("Levs Blinnikovs", finalBalance);

        // create test object
        BankAccountCurrentBalanceCalculator test = new BankAccountCurrentBalanceCalculator();

        // call tests
        test.calculate(bankAccount);

    }

}
