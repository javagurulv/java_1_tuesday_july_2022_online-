package teacher.lesson_13_exceptions.lessoncode.search;

public class BookAuthorSearchCriteria implements BookSearchCriteria {

	private String author;

	public BookAuthorSearchCriteria(String author) {
		this.author = author;
	}

	@Override
	public boolean satisfy(Book book) {
		return book.getAuthor().equals(author);
	}

}
