package teacher.lesson_11_interfaces.lessoncode.library;

import java.math.BigDecimal;

public class LibraryDemo {

	public static void main(String[] args) {

		Book book1 = new Book("A", "B");
		Book book2 = new Book("C", "D");

		Reader reader = new Reader("Petja");

		ReaderCard readerCard = new ReaderCard(reader);

		readerCard.addBook(book1);
		readerCard.addBook(book2);

		ReaderCardItem readerCardItem = readerCard.getItems().get(0);
		Penalty penalty = new Penalty(readerCardItem, new BigDecimal("10.00"));

	}

}
