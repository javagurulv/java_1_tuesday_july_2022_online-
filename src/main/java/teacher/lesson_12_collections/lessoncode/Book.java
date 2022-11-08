package teacher.lesson_12_collections.lessoncode;

public class Book implements Comparable<Book> {

	private String author;
	private String title;

	private int pageCount;

	public Book(String author, String title, int pageCount) {
		this.author = author;
		this.title = title;
		this.pageCount = pageCount;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public int getPageCount() {
		return pageCount;
	}

	@Override
	public int compareTo(Book o) {
		int pageCount1 = this.getPageCount();
		int pageCount2 = o.getPageCount();
		if (pageCount1 == pageCount2) {
			return 0;
		}
		if (pageCount1 < pageCount2) {
			return -1;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return "Book{" +
				"author='" + author + '\'' +
				", title='" + title + '\'' +
				", pageCount=" + pageCount +
				'}';
	}
}
