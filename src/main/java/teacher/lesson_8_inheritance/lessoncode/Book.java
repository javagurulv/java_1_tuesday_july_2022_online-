package teacher.lesson_8_inheritance.lessoncode;

public class Book extends Object {

	private String title;

	public Book() {
		super();
	}


	public Book(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book{" +
				"title='" + title + '\'' +
				'}';
	}


	public static void main(String[] args) {
		Book book = new Book("ABC ABC");
		String bookStr = book.toString();
		System.out.println(bookStr);
	}
}
