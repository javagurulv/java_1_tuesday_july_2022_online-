package teacher.lesson_15_streams.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class FruitStore {

	private List<Fruit> fruits = new ArrayList<>();

	public FruitStore() {
		fruits.add(new Fruit("apple", "red", 100));
		fruits.add(new Fruit("apple", "green", 200));
		fruits.add(new Fruit("pear", "red", 100));
		fruits.add(new Fruit("pear", "yellow", 100));
		fruits.add(new Fruit("tomato", "red", 100));
	}

	public List<Fruit> getAllFruits() {
		return fruits;
	}

	// Требование 1: отобрать все яблоки
	public List<Fruit> getAllApples() {
		List<Fruit> apples = new ArrayList<>();
		for (Fruit fruit : fruits) {
			if ("apple".equals(fruit.getTitle())) {
				apples.add(fruit);
			}
		}
		return apples;
	}

	// Требование 2: отобрать все груши
	public List<Fruit> getAllPears() {
		List<Fruit> pears = new ArrayList<>();
		for (Fruit fruit : fruits) {
			if ("pear".equals(fruit.getTitle())) {
				pears.add(fruit);
			}
		}
		return pears;
	}

	// Требование 3: отобрать все помидоры
	public List<Fruit> findAllFruitsByTitle(String fruitTitle) {
		List<Fruit> foundFruits = new ArrayList<>();
		for (Fruit fruit : fruits) {
			if (fruitTitle.equals(fruit.getTitle())) {
				foundFruits.add(fruit);
			}
		}
		return foundFruits;
	}

	// Требование 4: красные фрукты
	public List<Fruit> findAllFruitsByColor(String fruitColor) {
		List<Fruit> foundFruits = new ArrayList<>();
		for (Fruit fruit : fruits) {
			if (fruitColor.equals(fruit.getColor())) {
				foundFruits.add(fruit);
			}
		}
		return foundFruits;
	}


	// Требование 5: красные помидоры
	public List<Fruit> findFruitsByTitleAndColor(String fruitTitle,
												 String fruitColor) {
		List<Fruit> foundFruits = new ArrayList<>();
		for (Fruit fruit : fruits) {
			if (fruitTitle.equals(fruit.getTitle())
					&& fruitColor.equals(fruit.getColor())) {
				foundFruits.add(fruit);
			}
		}
		return foundFruits;
	}

	// Требование 6: красные помидоры > 100
	public List<Fruit> findFruitsBySearchCriteria(FruitSearchCriteria fruitSearchCriteria) {
		List<Fruit> foundFruits = new ArrayList<>();
		for (Fruit fruit : fruits) {
			if (fruitSearchCriteria.test(fruit)) {
				foundFruits.add(fruit);
			}
		}
		return foundFruits;
	}


}
