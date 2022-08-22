package teacher.lesson_5_arrays_for_loop.lessoncode;

class Transaction {

	private boolean incoming;

	private int money;

	public Transaction(boolean incoming, int money) {
		this.incoming = incoming;
		this.money = money;
	}

	public boolean isIncoming() {
		return incoming;
	}

	public int getMoney() {
		return money;
	}
}
