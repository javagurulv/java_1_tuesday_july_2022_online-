package teacher.lesson_11_interfaces.lessoncode;

public class BrokerSystem {

	public static void main(String[] args) {
		InsurancePolicyCalculator calculator = new InsurancePolicyCalculatorImpl();
		Broker broker = new Broker(calculator);
		broker.run();
	}

}
