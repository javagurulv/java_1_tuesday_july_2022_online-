package teacher.lesson_12_collections.lessoncode.startegy;

import java.util.HashMap;
import java.util.Map;

public class Menu {

	public static void main(String[] args) {

		Map<Integer, UICommand> menu = new HashMap<>();

		menu.put(1, new AddCommand());
		menu.put(2, new RemoveCommand());

		int userChoice = 1;

		UICommand command = menu.get(userChoice);
		command.execute();

	}

}
