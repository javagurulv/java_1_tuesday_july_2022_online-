package teacher.lesson_13_exceptions.lessoncode.search;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

	private List<Book> books = new ArrayList<>();

	public BookLibrary() {
		books.add(new Book("A my search", "A"));
		books.add(new Book("B", "B"));
		books.add(new Book("C", "C"));
		books.add(new Book("D", "D"));
		books.add(new Book("A", "A my search"));
	}

	public List<Book> findBooksByTitle(String title) {
		List<Book> foundBooks = new ArrayList<>();
		for (Book book : books) {
			if (book.getTitle().equals(title)) {
				foundBooks.add(book);
			}
		}
		return foundBooks;
	}

	public List<Book> findBooksByAuthor(String author) {
		List<Book> foundBooks = new ArrayList<>();
		for (Book book : books) {
			if (book.getAuthor().equals(author)) {
				foundBooks.add(book);
			}
		}
		return foundBooks;
	}

	public List<Book> findBooksByTitleAndAuthor(String title,
												String author) {
		List<Book> foundBooks = new ArrayList<>();
		for (Book book : books) {
			if (book.getAuthor().equals(author)
				&& book.getTitle().equals(title)) {
				foundBooks.add(book);
			}
		}
		return foundBooks;
	}


	public List<Book> findBookByCriteria(BookSearchCriteria searchCriteria) {
		List<Book> foundBooks = new ArrayList<>();
		for (Book book : books) {
			if (searchCriteria.satisfy(book)) {
				foundBooks.add(book);
			}
		}
		return foundBooks;
	}

}
