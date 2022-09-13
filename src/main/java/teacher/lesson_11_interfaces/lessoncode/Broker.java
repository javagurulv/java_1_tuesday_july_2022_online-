package teacher.lesson_11_interfaces.lessoncode;

import java.math.BigDecimal;

public class Broker {

	private InsurancePolicyCalculator calculator;

	public Broker(InsurancePolicyCalculator calculator) {
		this.calculator = calculator;
	}

	public void run() {
		// get policy data from user (UI)
		Policy policy = new Policy();
		BigDecimal price = calculator.calculate(policy);
		// show price to user
	}

}
