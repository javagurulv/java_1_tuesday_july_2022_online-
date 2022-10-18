package teacher.lesson_14_junit.lessoncode;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BookTest {

	@Test
	public void shouldBeEquals() {
		Book book1 = new Book("A");
		Book book2 = new Book("A");

		int[] ar1 = {};
		int[] ar2 = {};
		assertArrayEquals(ar1, ar2);

		assertEquals(book1, book2);
		assertTrue(book1.equals(book2));
	}

	@Test
	public void shouldNotBeEquals() {
		Book book1 = new Book("A");
		Book book2 = new Book("B");
		assertNotEquals(book1, book2);
		assertFalse(book1.equals(book2));
	}

}