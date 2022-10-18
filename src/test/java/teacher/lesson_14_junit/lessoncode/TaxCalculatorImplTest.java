package teacher.lesson_14_junit.lessoncode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TaxCalculatorImplTest {

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

	@Test  //(expected = RuntimeException.class)
	public void shouldReturn25ProcTaxBefore20k() {
		double realTax = calculator.calculate(10000.0);
		assertEquals(realTax, 2500.0, 0.0001);
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