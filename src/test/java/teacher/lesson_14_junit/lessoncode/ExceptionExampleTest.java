package teacher.lesson_14_junit.lessoncode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionExampleTest {

	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();


	@Test
	public void testOldWay() {
		try {
			ExceptionExample e = new ExceptionExample();
			e.throwException();
			fail();
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "3ABCD");
		}
	}

	@Test(expected = RuntimeException.class)
	public void testOldWayV2() {
		ExceptionExample e = new ExceptionExample();
		e.throwException();
	}

	@Test
	public void test() {
		exceptionRule.expect(RuntimeException.class);
		exceptionRule.expectMessage("3ABCD");
		ExceptionExample e = new ExceptionExample();
		e.throwException();
	}

}