package teacher.lesson_5_arrays_for_loop.lessoncode;

class BankAccount {

	private String owner;

	private int money;

	public BankAccount(String owner) {
		this.owner = owner;
		this.money = 0;
	}

	public void executeTransaction(Transaction transaction) {
		if (transaction.isIncoming()) {
			this.money += transaction.getMoney();
			//this.money = this.money + transaction.getMoney();
		} else {
			this.money -= transaction.getMoney();
		}
	}

	public int getMoney() {
		return money;
	}
}
