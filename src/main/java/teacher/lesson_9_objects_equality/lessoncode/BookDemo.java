package teacher.lesson_9_objects_equality.lessoncode;

public class BookDemo {

	public static void main(String[] args) {
		Book book1 = new Book("Star", "A");
		Book book2 = new Book("Star", "A");

		//book1 = book2;

		if (book1 == book2) {
			System.out.println("References are equals!");
		} else {
			System.out.println("References are NOT equals!");
		}

		//book2 = null;

		Car car = new Car(true, 2.0);

		if (book1.equals(book2)) {
			System.out.println("Books are equals!");
		} else {
			System.out.println("Books are NOT equals!");
		}


/*
		Book[] books = new Book[10];
		for (Book book : books) {
			System.out.println(book);
		}
*/

	}

}
