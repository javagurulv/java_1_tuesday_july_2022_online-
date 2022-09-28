package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_1_intern.task_6;

import teacher.codereview.CodeReview;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

@CodeReview(approved = true)
class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.evenTest(2, true);
        test.evenTest(1, false);
    }

    void evenTest(int numberToTest, boolean expectedResult) {
        NumberUtils test = new NumberUtils();
        boolean realResult = test.isEven(numberToTest);
        printTestResult(expectedResult == realResult);
    }

}
