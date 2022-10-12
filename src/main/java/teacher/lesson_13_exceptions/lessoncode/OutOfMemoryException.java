package teacher.lesson_13_exceptions.lessoncode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OutOfMemoryException {

	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		while (true) {
			Random random = new Random();
			str.add("sdsds" + random.nextInt(1000000000));
		}
	}

}
