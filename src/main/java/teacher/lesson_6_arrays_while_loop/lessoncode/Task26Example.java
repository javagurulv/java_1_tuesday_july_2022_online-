package teacher.lesson_6_arrays_while_loop.lessoncode;

class Task26Example {

	// one line comment

/*
	Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.
*/

	public static void main(String[] args) {
		ArrayUtil arrayUtil = new ArrayUtil();

		int arrLength = arrayUtil.getArrayLengthFromUser();
		int[] arr = arrayUtil.createArray(arrLength);
		arrayUtil.fillArrayWithRandomNumbers(arr);
		arrayUtil.printArrayToConsole(arr);
	}


}
