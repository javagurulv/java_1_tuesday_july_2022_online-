package teacher.lesson_14_junit.lessoncode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void shouldBeSame() {
		List<String> list1 = Arrays.asList("1", "2", "3", "4");
		List<String> list2 = Arrays.asList("1", "2", "3", "4");
		assertEquals(list1, list2);
		assertNotSame(list1, list2);
	}

	@Test
	public void shouldBeNotSame() {
		List<String> list1 = List.of("1", "2", "3", "4");
		List<String> list2 = List.of("1", "2", "3");
		assertNotEquals(list1, list2);
	}

}
