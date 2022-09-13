package teacher.lesson_17_multithreading.lessoncode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiMultyThreading {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		List<String> result = list.stream().parallel()
				.filter(s -> s.equals("ABC"))
				.collect(Collectors.toList());

	}

}
