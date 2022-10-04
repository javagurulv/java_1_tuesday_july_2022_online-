package teacher.lesson_12_collections.lessoncode;

import java.util.Comparator;

public class AuthorBookComparator implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
		String author1 = book1.getAuthor();
		String author2 = book2.getAuthor();
		return author1.compareTo(author2);
	}

}
