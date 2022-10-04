package teacher.lesson_12_collections.lessoncode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample extends Object {

	public static void main(String[] args) {

		Set<String> authors = new HashSet<>();

		System.out.println("Set isEmpty = " + authors.isEmpty());
		System.out.println("Set size = " + authors.size());

		authors.add("D");
		authors.add("E");
		authors.add("A");
		authors.add("B");
		authors.add("C");
		authors.add("C1");
		authors.add("C2");
		authors.add("C3");
		authors.add("C4");

		for (String author : authors) {
			System.out.println(author);
		}

		System.out.println("Set size = " + authors.size());

		authors.add("B");
		System.out.println("Set size = " + authors.size());

		for(String author : authors) {
			System.out.println(author);
		}

		authors.remove("A");
		System.out.println("Set size = " + authors.size());
		for(String author : authors) {
			System.out.println(author);
		}

		boolean containsA = authors.contains("B");
		System.out.println("Contains A = " + containsA);

		Set<String> titles = new TreeSet();

		int result = "A".compareTo("B"); // -1 | 0 | +1
		System.out.println("Compare To = " + result);

		titles.add("E");
		titles.add("D");
		titles.add("C");
		titles.add("C1");
		titles.add("C2");
		titles.add("C3");
		titles.add("C4");
		titles.add("B");
		titles.add("A");

		for (String title : titles) {
			System.out.println(title);
		}

	}

}
