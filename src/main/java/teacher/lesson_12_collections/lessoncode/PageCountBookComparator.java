package teacher.lesson_12_collections.lessoncode;

import java.util.Comparator;

public class PageCountBookComparator implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
		int pageCount1 = book1.getPageCount();
		int pageCount2 = book2.getPageCount();
		if (pageCount1 == pageCount2) {
			return 0;
		}
		if (pageCount1 < pageCount2) {
			return -1;
		} else {
			return 1;
		}
	}

}
