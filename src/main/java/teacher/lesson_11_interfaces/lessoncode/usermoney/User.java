package teacher.lesson_11_interfaces.lessoncode.usermoney;

public class User {

	private Wallet wallet;
	private CreditCard creditCard;

	public User(Wallet wallet, CreditCard creditCard) {
		this.wallet = wallet;
		this.creditCard = creditCard;
	}


	public void withdrawMoney() {
		// int money = creditCard.getMoney();
		// wallet.addMoney(money);
	}

}
