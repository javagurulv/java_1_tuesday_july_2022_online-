package teacher.lesson_14_junit.lessoncode;

public class TaxCalculatorImpl implements TaxCalculator {

	@Override
	public double calculate(double income) {
		return income * 0.25;
	}

	public int calc() {
		return 0;
	}

}
