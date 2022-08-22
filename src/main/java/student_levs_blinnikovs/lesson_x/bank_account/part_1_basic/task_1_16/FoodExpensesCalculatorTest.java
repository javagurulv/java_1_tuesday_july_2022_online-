package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_16;

class FoodExpensesCalculatorTest {

    public static void main(String[] args) {

        Transaction salaryPayment = TransactionFactory.createDepositTransaction(2000);
        Transaction taxReturnPayment = TransactionFactory.createDepositTransaction(500);
        Transaction rentPayment = TransactionFactory.createWithdrawalTransaction(350, ExpenseCategory.RENT);
        Transaction carLeasePayment = TransactionFactory.createWithdrawalTransaction(250, ExpenseCategory.LEASE);
        Transaction groceriesPayment = TransactionFactory.createWithdrawalTransaction(180, ExpenseCategory.FOOD);   //
        Transaction foodOutPayment = TransactionFactory.createWithdrawalTransaction(220, ExpenseCategory.FOOD);     //
        Transaction cinemaTicketsPayment = TransactionFactory.createWithdrawalTransaction(50, ExpenseCategory.ENTERTAINMENT);

        Transaction[] transactions = {salaryPayment, taxReturnPayment, rentPayment, carLeasePayment, groceriesPayment, foodOutPayment, cinemaTicketsPayment};

        BankAccount bankAccount = new BankAccount("Frank Foodie", 0, transactions);

        FoodExpensesCalculator test = new FoodExpensesCalculator();
        System.out.println(test.calculateExpensesAmount(bankAccount)); // expected 400 for FOOD

    }

}
