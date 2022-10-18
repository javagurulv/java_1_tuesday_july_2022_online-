package teacher.lesson_14_junit.lessoncode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TaxCalculatorImplTest {

	@Test
	public void shouldReturn25ProcTax() {
		TaxCalculator calculator = new TaxCalculatorImpl();
		double realTax = calculator.calculate(100.0);
		assertEquals(realTax, 25.0, 1);
	}

	@Test
	public void shouldReturn25ProcTaxFail() {
		TaxCalculator calculator = new TaxCalculatorImpl();
		double realTax = calculator.calculate(100.0);
		assertEquals(realTax, 25.0, 0.0001);
	}


}