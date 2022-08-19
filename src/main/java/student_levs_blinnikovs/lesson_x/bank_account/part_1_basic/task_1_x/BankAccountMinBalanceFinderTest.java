package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_x;

class BankAccountMinBalanceFinderTest {

    public static void main(String[] args) {

        // create transactions
        Transaction salaryPayment = new Transaction(1200, TransactionType.DEPOSIT);   // current 1200 min 1200
        Transaction rentPayment = new Transaction(300, TransactionType.WITHDRAWAL);   // current 900 min 900
        Transaction taxReturnPayment = new Transaction(500, TransactionType.DEPOSIT); // current 1400 min 900
        Transaction leasePayment = new Transaction(600, TransactionType.WITHDRAWAL);  // current 800 min 800
        Transaction otherPayment = new Transaction(850, TransactionType.WITHDRAWAL); // current -50 (450 for cred lim)
        // expected to have 1400 at the end as it was the highest

        // saving all transactions to an array
        Transaction[] transactions = {salaryPayment, rentPayment, taxReturnPayment, leasePayment, otherPayment};

        // pass bank account owner and transactions array
        BankAccount bankAccount = new BankAccount("Levs Blinnikovs", 0, transactions);

        // create test object
        BankAccountMinBalanceFinder test = new BankAccountMinBalanceFinder();

        // call tests
        int result = test.find(bankAccount);
        System.out.println("Smallest balance was: " + result + " EUR.");

        // test with credit limit using same transactions
        // pass bank account owner and transactions array
        BankAccount bankAccountWithCreditLimit = new BankAccount("Mike Creditlover", 500, transactions);

        // create test object
        BankAccountMinBalanceFinder testWithCreditLimit = new BankAccountMinBalanceFinder();

        // call tests
        int resultTestWithCreditLimit = testWithCreditLimit.find(bankAccountWithCreditLimit);
        System.out.println("Smallest balance for account with credit limit is: " + resultTestWithCreditLimit + " EUR.");

    }

}
