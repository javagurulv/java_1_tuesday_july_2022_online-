package teacher.lesson_5_arrays_for_loop.homework.level_7_senior.task_41;

public class Task29 {

	public static void main(String[] args) {
		ArrayUtil arrayUtil = new ArrayUtil();
		int[] array = arrayUtil.newArrayWithRandomLength();
		arrayUtil.fillArrayWithRandomNumbers(array);
		arrayUtil.printArray(array);
		arrayUtil.printEvenNumbersOfArray(array);
	}

}
