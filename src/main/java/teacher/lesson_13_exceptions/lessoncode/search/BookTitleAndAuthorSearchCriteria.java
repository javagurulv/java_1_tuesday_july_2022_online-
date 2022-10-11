package teacher.lesson_13_exceptions.lessoncode.search;

public class BookTitleAndAuthorSearchCriteria implements BookSearchCriteria {

	private String title;
	private String author;

	public BookTitleAndAuthorSearchCriteria(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public boolean satisfy(Book book) {
		return book.getAuthor().equals(author)
				&& book.getTitle().equals(title);
	}

}


