package teacher.lesson_9_objects_equality.lessoncode;

import java.util.Objects;

public class Book {

	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Book book = (Book) o;
		return Objects.equals(title, book.title) &&
				Objects.equals(author, book.author);
	}


}
