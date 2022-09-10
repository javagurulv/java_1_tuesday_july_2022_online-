package teacher.lesson_12_collections.lessoncode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		// int, long, double, float, boolean

		Integer numberI = Integer.parseInt("3");
		Long nuberL = Long.parseLong("3");

		List<Integer> numbers = new ArrayList<>();

		System.out.println("List length = " + numbers.size());
		System.out.println("List isEmpty = " + numbers.isEmpty());

		numbers.add(Integer.parseInt("4"));
		numbers.add(3);
		numbers.add(4);
		numbers.add(5); // -> numbers.add(new Integer(5))
		numbers.add(6);

		numbers.add(0, 777);

		///numbers.add(3L);

		System.out.println("List length = " + numbers.size());

		System.out.println("List isEmpty = " + numbers.isEmpty());

		numbers.add(777);
		numbers.add(777);
		numbers.add(777);

		for (int i = 0; i < numbers.size(); i++) {
			Integer number = numbers.get(i);
			int primitiveNumber = numbers.get(i);
			System.out.println(number);
		}

		for (Integer number : numbers) {
			System.out.println(number);
		}

		numbers.forEach(System.out::println);

		numbers.remove(0);

		numbers.remove(Integer.parseInt("5"));

		List<Integer> numbersToRemove = new ArrayList<>();
		numbersToRemove.add(Integer.parseInt("777"));

		numbers.removeAll(numbersToRemove);

		System.out.println("After remove:");
		numbers.forEach(System.out::println);

		List<String> words = new LinkedList<>();

		boolean contains3 = numbers.contains(3);
		System.out.println("Contains 3 = " + contains3);

	}

}
