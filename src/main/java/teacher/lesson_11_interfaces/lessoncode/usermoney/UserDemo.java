package teacher.lesson_11_interfaces.lessoncode.usermoney;

public class UserDemo {

	public static void main(String[] args) {
		Wallet wallet = new Wallet();
		CreditCard creditCard = new CreditCard();
		User user = new User(wallet, creditCard);


	}

}
