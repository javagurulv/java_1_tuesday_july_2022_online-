package teacher.lesson_7_encapsulation.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class DogFerma {

	private List<Dog> dogs = new ArrayList<>();

	public void addDog() {
		Dog dog = new Dog("Sharik", "man");
		dogs.add(dog);
	}

	public void removeDog() {
		if (dogs.size() > 0) {
			dogs.remove(0);
		}
	}

	public int countDogs() {
		return dogs.size();
	}

}
