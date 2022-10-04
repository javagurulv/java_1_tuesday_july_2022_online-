package teacher.lesson_12_collections.lessoncode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BookDemo {

	public static void main(String[] args) {
		Book book1 = new Book("Abc", "CDE", 10);
		Book book2 = new Book("XYZ", "AES", 9);

		System.out.println(book1.compareTo(book2));

		List<Book> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);

		System.out.println(books);

		books.sort(new PageCountBookComparator());

		System.out.println(books);

		books.sort(new AuthorBookComparator());

		System.out.println(books);


		Set<Book> bookSet = new TreeSet<>(new PageCountBookComparator());
		bookSet.add(book1);
		bookSet.add(book2);
		System.out.println(bookSet);

		for (Book b : bookSet) {
			System.out.println(b);
		}


	}


}
