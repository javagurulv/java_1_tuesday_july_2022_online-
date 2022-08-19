package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_16;

class BankAccountMaxBalanceFinderTest {

    public static void main(String[] args) {

        // create transactions
        Transaction salaryPayment = new Transaction(1200, TransactionType.DEPOSIT);   // current 1200 max 1200
        Transaction rentPayment = new Transaction(300, TransactionType.WITHDRAWAL);   // current 900 max 1200
        Transaction taxReturnPayment = new Transaction(500, TransactionType.DEPOSIT); // current 1400 max 1400
        Transaction leasePayment = new Transaction(600, TransactionType.WITHDRAWAL);  // current 800 max 1400
        // expected to have 1400 at the end as it was the highest

        // saving all transactions to an array
        Transaction[] transactions = {salaryPayment, rentPayment, taxReturnPayment, leasePayment};

        // pass bank account owner and transactions array
        BankAccount bankAccount = new BankAccount("Levs Blinnikovs", 0, transactions);

        // create test object
        BankAccountMaxBalanceFinder test = new BankAccountMaxBalanceFinder();

        // call tests
        int result = test.find(bankAccount);
        System.out.println("Highest balance was: " + result + " EUR.");

        // test with credit limit using same transactions
        // pass bank account owner and transactions array
        BankAccount bankAccountWithCreditLimit = new BankAccount("Mike Creditlover", 500, transactions);

        // create test object
        BankAccountMaxBalanceFinder testWithCreditLimit = new BankAccountMaxBalanceFinder();

        // call tests
        int resultTestWithCreditLimit = testWithCreditLimit.find(bankAccountWithCreditLimit);
        System.out.println("Max balance for account with credit limit is: " + resultTestWithCreditLimit + " EUR.");

    }

}
