package teacher.lesson_15_streams.lessoncode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FruitStreamApi {

	private List<Fruit> fruits = new ArrayList<>();

	public FruitStreamApi() {
		fruits.add(new Fruit("apple", "red", 100));
		fruits.add(new Fruit("apple", "green", 200));
		fruits.add(new Fruit("pear", "red", 100));
		fruits.add(new Fruit("pear", "yellow", 100));
		fruits.add(new Fruit("tomato", "red", 100));
	}

	public List<Fruit> getAllFruits() {
		return fruits;
	}

	public List<Fruit> findAllApples() {
		Stream<Fruit> fruitStream = fruits.stream();

		return fruits.stream()
				.filter(fruit -> "apple".equals(fruit.getTitle()))
				.collect(Collectors.toList());
	}

	public List<Fruit> findRedApplesWithWeightBiggerThen100() {
		return fruits.stream()
				.filter(fruit -> "apple".equals(fruit.getTitle()))
				.filter(fruit -> "red".equals(fruit.getColor()))
				.filter(fruit -> fruit.getWeight() > 100)
				.collect(Collectors.toList());
	}

	public Set<String> findAllFruitUniqNames() {
		return fruits.stream()
					 .map(fruit -> fruit.getTitle())
					 .collect(Collectors.toSet());
	}

	public Set<String> findAllUniqColors() {
		return fruits.stream()
				.map(fruit -> fruit.getColor())
				.collect(Collectors.toSet());
	}

	public Set<Integer> findAllUniqWeights() {
		return fruits.stream()
				//.map(fruit -> fruit.getWeight())
				.map(Fruit::getWeight)
				.collect(Collectors.toSet());
	}


	public List<String> findAllFruitUniqueNames() {
		return fruits.stream()
				.map(Fruit::getTitle)
				//.map(fruit -> fruit.getTitle())
				.distinct()
				.collect(Collectors.toList());
	}

	public Optional<Fruit> findAnyApple() {
		return fruits.stream()
					 .filter(fruit -> "apple".equals(fruit.getTitle()))
					 .findAny();
	}

	public boolean isAnyAppleExist() {
		return fruits.stream()
				.anyMatch(fruit -> "apple".equals(fruit.getTitle()));
	}

	public long countApples() {
		return fruits.stream()
				.filter(fruit -> "apple".equals(fruit.getTitle()))
				.count();
	}

	public List<Fruit> sortApples() {
		return fruits.stream()
				.filter(fruit -> "apple".equals(fruit.getTitle()))
				.sorted((o1, o2) -> {
					Integer weight1 = o1.getWeight();
					Integer weight2 = o2.getWeight();
					return weight1.compareTo(weight2);
				})
				.collect(Collectors.toList());
	}

	public Optional<Fruit> findSmallestApple() {
		return fruits.stream()
				.filter(fruit -> "apple".equals(fruit.getTitle()))
				.min((o1, o2) -> {
					Integer weight1 = o1.getWeight();
					Integer weight2 = o2.getWeight();
					return weight1.compareTo(weight2);
				});
	}

	public Optional<Fruit> findBiggerApple() {
		return fruits.stream()
				.filter(fruit -> "apple".equals(fruit.getTitle()))
				.max((o1, o2) -> {
					Integer weight1 = o1.getWeight();
					Integer weight2 = o2.getWeight();
					return weight1.compareTo(weight2);
				});
	}

	public Optional<Fruit> findFirstApple() {
		return fruits.stream()
				.filter(fruit -> "apple".equals(fruit.getTitle()))
				.findFirst();
	}
}
