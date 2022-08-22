package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_16;

class BankAccountTransactionApproverTest {

    public static void main(String[] args) {

        // don't test, preparing account. no point if adding more, we are not testing calculate method here.
        Transaction salaryPayment = new Transaction(2000);

        // saving salary transaction to an array
        Transaction[] bankAccountBalanceCreateTransactions = {salaryPayment};

        // pass bank account owner and transactions array
        BankAccount bankAccount = new BankAccount("Levs Blinnikovs", 0, bankAccountBalanceCreateTransactions);
        // for credit enabled test
        BankAccount bankAccountWithCreditLimit = new BankAccount("Mike CreditLover", 500, bankAccountBalanceCreateTransactions);

        // prep data for transactions to test
        Transaction rentPayment = new Transaction(300, ExpenseCategory.UTILITIES); // should be allowed as per amount
        Transaction receiveGiftPayment = new Transaction(100); // should be allowed as per type
        Transaction carBuyWithCashPayment = new Transaction(2450, ExpenseCategory.OTHERS);  // should NOT be allowed as per amount but not with credit limit case

        // create calculator object to pass to approver constructor
        BankAccountCurrentBalanceCalculator calculator = new BankAccountCurrentBalanceCalculator();

        // create test objects
        BankAccountTransactionApprover test = new BankAccountTransactionApprover(calculator);

        // call tests
        boolean rentPaymentTestResult = test.isApproved(bankAccount, rentPayment);
        System.out.println("Rent payment should be OK, expect true, is: " + rentPaymentTestResult + "\n");

        boolean receiveGiftPaymentTestResult = test.isApproved(bankAccount, receiveGiftPayment);
        System.out.println("Receive gift payment should be OK, expect true, is: " + receiveGiftPaymentTestResult + "\n");

        boolean carBuyWithCashPaymentTestResult = test.isApproved(bankAccount, carBuyWithCashPayment);
        System.out.println("Car buy with cash payment should be NOT OK, expect false, is: " + carBuyWithCashPaymentTestResult + "\n");

        boolean carBuyWithCashPaymentWithCreditLimitTestResult = test.isApproved(bankAccountWithCreditLimit, carBuyWithCashPayment);
        System.out.println("Car buy with cash payment with credit limit should be OK, expect true, is: " + carBuyWithCashPaymentWithCreditLimitTestResult + "\n");


    }

}
