package teacher.lesson_4_if_statement.lessoncode;

class LogicalConditions {

	public static void main(String[] args) {
		int number = 10;

		boolean isBiggerThen10 = number > 10;
		boolean isLessThen20 = number < 20;

		// && - and
		boolean inInterval = isBiggerThen10 && isLessThen20;

		inInterval = (number > 10) && (number < 20);

		inInterval = number > 10 && number < 20;

		// || - or
		inInterval = (number < 10) || (number > 20);

		if ((number < 10) || (number > 20)) {
			System.out.println("Out of diapazon!");
		}

		if ((number > 10) && (number < 20)) {
			System.out.println("Inside diapazon!");
		}

		if ((number < 10) | (number > 20)) {
			System.out.println("Out of diapazon!");
		}

		if ((number > 10) & (number < 20)) {
			System.out.println("Inside diapazon!");
		}

	}

}
