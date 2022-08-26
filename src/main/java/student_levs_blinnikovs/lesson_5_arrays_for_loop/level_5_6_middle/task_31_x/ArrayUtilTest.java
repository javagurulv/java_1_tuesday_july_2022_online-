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

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.ArrayList;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Это не тесты, это маленькие Demo программы. "
		+ "Тест это подготовка входных данных (не рандом если это можно),"
		+ "вызов продакшн кода и проверка результатов.", student = "Probably fixed.")
class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();

        test.shouldCreateArray();
        test.shouldReturnMaxNumber();
        test.shouldReturnMinNumber();

    }

    public ArrayUtil prepareTestObject() {
        return new ArrayUtil();
    }

    public boolean compareRealExpected(int realResult, int expectedResult) {
        return realResult == expectedResult;
    }

    public String prepareTestResult(boolean isTestOK) {
        return isTestOK ? "Test OK" : "Test NOT OK";
    }

    public void reportTest(String testResult) {
        System.out.println(testResult);
    }

    public void shouldCreateArray() {
        int expectedArrayLength = 3;
        int realArrayLength = prepareTestObject().createArray(expectedArrayLength).length;
        reportTest(prepareTestResult(compareRealExpected(realArrayLength, expectedArrayLength)));
    }

    public void shouldReturnMaxNumber() {
        int[] testArray = {1,2,3};
        int realMaxNumber = prepareTestObject().findMaxNumber(testArray);
        int expectedMaxNumber = 3;
        reportTest(prepareTestResult(compareRealExpected(realMaxNumber, expectedMaxNumber)));
    }

    public void shouldReturnMinNumber() {
        int[] testArray = {1,2,3};
        int realMinNumber = prepareTestObject().findMinNumber(testArray);
        int expectedMinNumber = 1;
        reportTest(prepareTestResult(compareRealExpected(realMinNumber, expectedMinNumber)));
    }

}
