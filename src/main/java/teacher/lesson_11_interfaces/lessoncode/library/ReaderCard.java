package teacher.lesson_11_interfaces.lessoncode.library;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReaderCard {

	private Reader reader;

	// issue date

	// srok godnosti

	private List<ReaderCardItem> items = new ArrayList<>();

	public ReaderCard(Reader reader) {
		this.reader = reader;
	}

	public void addBook(Book book) {
		ReaderCardItem item = new ReaderCardItem(this, book,
				new Date("01.01.2020"), new Date("01.02.2020"));
		items.add(item);
	}

	public List<ReaderCardItem> getItems() {
		return items;
	}
}
