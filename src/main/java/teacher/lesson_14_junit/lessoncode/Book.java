package teacher.lesson_14_junit.lessoncode;

import java.util.Objects;

class Book {

    String title;

    Book(String bookTitle) {
        this.title = bookTitle;
    }

    String getTitle() {
        return this.title;
    }

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Book book = (Book) o;
		return Objects.equals(title, book.title);
	}

	@Override
	public String toString() {
		return "Book{" +
				"ascfsdafvsdvds  title='" + title + '\'' +
				'}';
	}
}
