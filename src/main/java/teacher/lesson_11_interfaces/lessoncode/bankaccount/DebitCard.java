package teacher.lesson_11_interfaces.lessoncode.bankaccount;

public class DebitCard implements BankAccountOperation {

	private BankAccount bankAccount;

	public DebitCard(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public int withdrawMoney(int moneyToWithdraw) {
		return 0;
	}

	@Override
	public int depositMoney(int moneyToDeposit) {
		return 0;
	}
}
