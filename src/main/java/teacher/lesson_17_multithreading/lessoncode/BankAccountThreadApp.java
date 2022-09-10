package teacher.lesson_17_multithreading.lessoncode;

public class BankAccountThreadApp {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(0);

		Thread thread1 = new Thread(new AddMoneyThread(bankAccount));
		Thread thread2 = new Thread(new RemoveMoneyThread(bankAccount));

		long before = System.currentTimeMillis();

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {

		}

		long after = System.currentTimeMillis();

		System.out.println("Bank Account money = " + bankAccount.getMoney());
		System.out.println("Time = " + (after - before));

	}
}
