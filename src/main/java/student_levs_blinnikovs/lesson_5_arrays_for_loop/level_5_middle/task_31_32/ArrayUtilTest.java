package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_5_middle.task_31_32;

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
    }

    public void shouldCreateArray() {
        ArrayUtil testArrayUtilObj = new ArrayUtil();
        int realArrayLength = testArrayUtilObj.createArray(5).length;
        int expectedArrayLength = 5;
        if (realArrayLength == expectedArrayLength) {
            System.out.println("Array created correctly");
        } else {
            System.err.println("Array created incorrectly!");
        }

    }

}
