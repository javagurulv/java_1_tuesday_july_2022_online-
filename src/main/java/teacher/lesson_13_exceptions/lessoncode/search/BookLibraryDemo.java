package teacher.lesson_13_exceptions.lessoncode.search;

import java.util.List;

public class BookLibraryDemo {

	public static void main(String[] args) {
		BookLibrary library = new BookLibrary();

		List<Book> books1 = library.findBookByCriteria(
			new BookTitleSearchCriteria("A")
		);

		List<Book> books11 = library.findBookByCriteria(
				book -> book.getTitle().equals("A")
		);


		List<Book> book2 = library.findBookByCriteria(
				new BookTitleSearchCriteria("B")
		);

		List<Book> book3 = library.findBookByCriteria(
				new BookAuthorSearchCriteria("B")
		);

		List<Book> book4 = library.findBookByCriteria(
				new BookSearchCriteria() {

					@Override
					public boolean satisfy(Book book) {
						return book.getTitle().equals("ABC");
					}
				}
		);


		List<Book> book5 = library.findBookByCriteria(
				book -> book.getTitle().equals("ABC")
		);


		String searchString = "my search";
		List<Book> book6 = library.findBookByCriteria(
				book -> book.getTitle().contains(searchString)
					|| book.getAuthor().contains(searchString)
		);
		System.out.println(book6);

	}

}
