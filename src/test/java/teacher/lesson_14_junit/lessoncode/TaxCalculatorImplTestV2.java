package teacher.lesson_14_junit.lessoncode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TaxCalculatorImplTestV2 {

	// TaxCalculatorImplTest test = new TaxCalculatorImplTest()
	// test.init() // @Before
	// test.shouldReturn25ProcTaxBefore20k()  // @Test
	// test.init() // @Before
	// test.shouldReturnZero()    // @Test

	private TaxCalculator calculator;

	@Before
	public void init() {
		calculator = new TaxCalculatorImpl();
	}

	@Test
	public void shouldReturn25ProcTax() {
		double realTax = calculator.calculate(100.0);
		assertEquals(realTax, 25.0, 0.0001);
	}

	@Test
	public void shouldReturnZero() {
		double realTax = calculator.calculate(0.0);
		assertEquals(realTax, 0.0, 0.0001);
	}

	@Ignore
	public void shouldIgnore() {
		double realTax = calculator.calculate(0.0);
		assertEquals(realTax, 0.0, 0.0001);
	}

}