package teacher.lesson_15_streams.lessoncode;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class FruitStoreTest {

	private FruitStore fruitStore = new FruitStore();

	@Test
	public void getAllApples() {
		List<Fruit> apples = fruitStore.getAllApples();
		assertEquals(apples.size(), 2);
	}

	@Test
	public void getAllApplesV1() {
		List<Fruit> apples = fruitStore.findFruitsBySearchCriteria(
				(Fruit fruit) -> "apple".equals(fruit.getTitle())
		);
		assertEquals(apples.size(), 2);
	}


	@Test
	public void getAllPears() {
		List<Fruit> pears = fruitStore.getAllPears();
		assertEquals(pears.size(), 2);
	}

	@Test
	public void findAllPearsByTitle() {
		List<Fruit> pears = fruitStore.findAllFruitsByTitle("pear");
		assertEquals(pears.size(), 2);
	}

	@Test
	public void findAllApplesByTitle() {
		List<Fruit> apples = fruitStore.findAllFruitsByTitle("apple");
		assertEquals(apples.size(), 2);
	}

	@Test
	public void findFruitsBySearchCriteria_RedTomatos() {
		List<Fruit> redTomatos = fruitStore.findFruitsBySearchCriteria(
				new RedTomatosSearchCriteria()
		);
		assertEquals(redTomatos.size(), 1);
	}

	@Test
	public void findFruitsBySearchCriteria_Apples() {
		List<Fruit> apples = fruitStore.findFruitsBySearchCriteria(
				new ApplesSearchCriteria()
		);
		assertEquals(apples.size(), 2);
	}

	@Test
	public void findFruitsBySearchCriteria_RedTomatosBiggerThen100G() {
		List<Fruit> apples = fruitStore.findFruitsBySearchCriteria(
				new FruitSearchCriteria() {
					@Override
					public boolean test(Fruit fruit) {
						return "tomato".equals(fruit.getTitle())
								&& "red".equals(fruit.getColor())
								&& fruit.getWeight() > 100;
					}
				}
		);
		assertEquals(apples.size(), 0);
	}

	@Test
	public void lambda() {
		FruitSearchCriteria searchCriteria =
				(Fruit fruit) -> "tomato".equals(fruit.getTitle())
						&& "red".equals(fruit.getColor())
						&& fruit.getWeight() > 100;

		FruitSearchCriteria searchCriteria1 =
				new FruitSearchCriteria() {
					@Override
					public boolean test(Fruit fruit) {
						return "tomato".equals(fruit.getTitle())
								&& "red".equals(fruit.getColor())
								&& fruit.getWeight() > 100;
					}
				};
	}


}