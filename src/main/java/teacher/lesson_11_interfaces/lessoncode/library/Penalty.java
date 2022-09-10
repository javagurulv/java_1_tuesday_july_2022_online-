package teacher.lesson_11_interfaces.lessoncode.library;

import java.math.BigDecimal;

public class Penalty {

	private ReaderCardItem readerCardItem;
	private BigDecimal amount;

	public Penalty(ReaderCardItem readerCardItem, BigDecimal amount) {
		this.readerCardItem = readerCardItem;
		this.amount = amount;
	}


}
