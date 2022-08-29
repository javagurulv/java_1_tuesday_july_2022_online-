package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_5_6_7.task_31_41;

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

import java.util.Arrays;

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
        test.shouldReturnElementSum();
        test.shouldReturnElementAvg();
        test.shouldIncrementEachElementBy();
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
        int expectedMaxNumber = 3;
        int realMaxNumber = prepareTestObject().findMaxNumber(testArray);
        reportTest(prepareTestResult(compareRealExpected(realMaxNumber, expectedMaxNumber)));
    }

    public void shouldReturnMinNumber() {
        int[] testArray = {1,2,3};
        int expectedMinNumber = 1;
        int realMinNumber = prepareTestObject().findMinNumber(testArray);
        reportTest(prepareTestResult(compareRealExpected(realMinNumber, expectedMinNumber)));
    }

    public void shouldReturnElementSum() {
        int[] testArray = {1,2,3};
        int expectedElementSum = 6;
        int realElementSum = prepareTestObject().findElementSum(testArray);
        reportTest(prepareTestResult(compareRealExpected(realElementSum, expectedElementSum)));
    }

    public void shouldReturnElementAvg() {
        int[] testArray = {1,2,3};
        int expectedElementAvg = 2;
        int realElementAvg = prepareTestObject().findElementAvg(testArray);
        reportTest(prepareTestResult(compareRealExpected(realElementAvg, expectedElementAvg)));
    }

    public void shouldIncrementEachElementBy() {
        int[] testArray = {1,2,3};
        int increment = 2;
        int[] expectedIncrementedArray = {3,4,5};
        int[] realIncrementedArray = prepareTestObject().incrementEachElementBy(testArray, increment);
        reportTest(prepareTestResult(Arrays.equals(realIncrementedArray, expectedIncrementedArray)));
    }

}
