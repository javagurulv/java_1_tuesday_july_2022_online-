package teacher.lesson_11_interfaces.lessoncode.bankaccount;

public class CreditCard implements BankAccountOperation {

	private BankAccount bankAccount;

	public CreditCard(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public int withdrawMoney(int moneyToWithdraw) {
		//

		bankAccount.withdrawMoney(moneyToWithdraw);

		return 0;
	}

	@Override
	public int depositMoney(int moneyToDeposit) {
		//

		return 0;
	}
}
