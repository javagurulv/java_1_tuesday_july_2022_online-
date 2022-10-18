package teacher.lesson_15_streams.lessoncode;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

import org.junit.Test;

public class FruitStreamApiTest {

	private FruitStreamApi api = new FruitStreamApi();

	@Test
	public void findAllFruitUniqNames() {
		Set<String> uniqTitles = api.findAllFruitUniqNames();
		assertEquals(uniqTitles.size(), 3);
		assertTrue(uniqTitles.contains("apple"));
		assertTrue(uniqTitles.contains("pear"));
		assertTrue(uniqTitles.contains("tomato"));
	}

	@Test
	public void findAllFruitUniqueNames_distinct() {
		List<String> uniqTitles = api.findAllFruitUniqueNames();
		assertEquals(uniqTitles.size(), 3);
		assertTrue(uniqTitles.contains("apple"));
		assertTrue(uniqTitles.contains("pear"));
		assertTrue(uniqTitles.contains("tomato"));
	}

}