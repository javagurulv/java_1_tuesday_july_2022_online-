package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_16;

class BankAccountCurrentBalanceCalculatorTest {

    public static void main(String[] args) {

        // create transactions
        Transaction salaryPayment = new Transaction(1200);
        Transaction rentPayment = new Transaction(350, ExpenseCategory.UTILITIES);
        Transaction gasPayment = new Transaction(150, ExpenseCategory.OTHERS);
        Transaction taxReturnPayment = new Transaction(300);
        // expected to have 1000 at the end

        // saving all transactions to an array
        Transaction[] transactions = {salaryPayment, rentPayment, gasPayment, taxReturnPayment};

        // pass bank account owner and transactions array
        BankAccount bankAccount = new BankAccount("Levs Blinnikovs", 0, transactions);

        // create test object
        BankAccountCurrentBalanceCalculator test = new BankAccountCurrentBalanceCalculator();

        // call tests
        int result = test.calculate(bankAccount);
        System.out.println("Final balance is: " + result + " EUR.");


        // test with credit limit using same transactions
        // pass bank account owner and transactions array
        BankAccount bankAccountWithCreditLimit = new BankAccount("Mike Creditlover", 500, transactions);

        // create test object
        BankAccountCurrentBalanceCalculator testWithCreditLimit = new BankAccountCurrentBalanceCalculator();

        // call tests
        int resultTestWithCreditLimit = testWithCreditLimit.calculate(bankAccountWithCreditLimit);
        System.out.println("Final balance for account with credit limit is: " + resultTestWithCreditLimit + " EUR.");


    }

}
