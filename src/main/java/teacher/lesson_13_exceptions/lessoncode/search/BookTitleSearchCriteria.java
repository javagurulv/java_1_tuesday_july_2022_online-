package teacher.lesson_13_exceptions.lessoncode.search;

public class BookTitleSearchCriteria implements BookSearchCriteria {

	private String title;

	public BookTitleSearchCriteria(String title) {
		this.title = title;
	}

	@Override
	public boolean satisfy(Book book) {
		return book.getAuthor().equals(title);
	}

}

