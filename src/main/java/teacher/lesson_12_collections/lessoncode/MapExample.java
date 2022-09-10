package teacher.lesson_12_collections.lessoncode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// key (Integer) - value (String)
		// 1 - add
		// 2 - remove
		// 3 - find
		// 4 - exit

		// key (String) - value (Integer)
		// cat - 5
		// dog - 5
		// phone - 1

		Map<String, Integer> wordToCountMap = new HashMap<>();

		wordToCountMap.put("cat", 5);
		wordToCountMap.put("dog", 5);
		wordToCountMap.put("phone", 1);

		wordToCountMap.put("cat", 8);

		System.out.println("Map isEmpty = " + wordToCountMap.isEmpty());
		System.out.println("Map size = " + wordToCountMap.size());

		wordToCountMap.remove("dog");

		Set<String> allKeys = wordToCountMap.keySet();
		for (String key : wordToCountMap.keySet()) {
			Integer value = wordToCountMap.get(key);
			System.out.println("Key = " + key + " , value = " + value);
		}

	}

}
