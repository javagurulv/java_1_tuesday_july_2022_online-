package teacher.lesson_14_junit.lessoncode;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionExampleTest {

	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	@Test
	public void test() {
		exceptionRule.expect(RuntimeException.class);
		exceptionRule.expectMessage("ABCD");
		ExceptionExample e = new ExceptionExample();
		e.throwException();
	}

}