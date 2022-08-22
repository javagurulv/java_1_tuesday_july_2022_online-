package teacher.lesson_5_arrays_for_loop.lessoncode;

class BankAccountDemo {

	public static void main(String[] args) {

		BankAccount bankAccount = new BankAccount("Viktor");

		Transaction[] transactions = new Transaction[4];
		transactions[0] = new Transaction(true, 100);
		transactions[1] = new Transaction(false, 90);
		transactions[2] = new Transaction(true, 1000);
		transactions[3] = new Transaction(false, 100);

		/*bankAccount.executeTransaction(transactions[0]);
		bankAccount.executeTransaction(transactions[1]);
		bankAccount.executeTransaction(transactions[2]);
		bankAccount.executeTransaction(transactions[3]);
*/
		for (int i = 0; i < transactions.length; i++) {
			Transaction transaction = transactions[i];
			bankAccount.executeTransaction(transaction);
		}

		System.out.println("Money = " + bankAccount.getMoney());

	}

}
