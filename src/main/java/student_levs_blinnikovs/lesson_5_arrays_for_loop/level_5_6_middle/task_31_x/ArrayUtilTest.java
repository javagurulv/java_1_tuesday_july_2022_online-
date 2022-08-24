package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_5_6_middle.task_31_x;

/*
Создайте класс ArrayUtilTest.
В этом классе напишите автоматический тест
для метода int[] createArray(int arrayLength)
из предыдущего задания.

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        // Напишите реализацию !!!
        // Проверьте, что метод создаёт массив указанной длины
    }

}
 */

class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();

        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldPrintArrayToConsole();
        test.shouldReturnMaxNumber();

    }

    public void shouldCreateArray() {
        System.out.println("\nTest 1");
        ArrayUtil testArrayUtilObj = new ArrayUtil();
        int realArrayLength = testArrayUtilObj.createArray(5).length;
        int expectedArrayLength = 5;
        if (realArrayLength == expectedArrayLength) {
            System.out.println("Array created correctly");
        } else {
            System.err.println("Array created incorrectly!");
        }
    }

    public void shouldFillArrayWithRandomNumbers() {
        System.out.println("\nTest 2");
        ArrayUtil testArrayUtilObj = new ArrayUtil();
        int[] testArray = testArrayUtilObj.createArray(3);
        testArrayUtilObj.fillArrayWithRandomNumbers(testArray);
        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }
    }

    public void shouldPrintArrayToConsole() {
        System.out.println("\nTest 3");
        ArrayUtil testArrayUtilObj = new ArrayUtil();
        int[] testArray = testArrayUtilObj.createArray(3);
        testArrayUtilObj.fillArrayWithRandomNumbers(testArray);
        testArrayUtilObj.printArrayToConsole(testArray);
    }

    public void shouldReturnMaxNumber() {
        System.out.println("\nTest 4");
        ArrayUtil testArrayUtilObj = new ArrayUtil();
        int[] testArray = testArrayUtilObj.createArray(3);
        testArrayUtilObj.fillArrayWithRandomNumbers(testArray);
        testArrayUtilObj.printArrayToConsole(testArray);
        int maxNumber = testArrayUtilObj.findMaxNumber(testArray);
        System.out.println("Max is: " + maxNumber);
    }

}
