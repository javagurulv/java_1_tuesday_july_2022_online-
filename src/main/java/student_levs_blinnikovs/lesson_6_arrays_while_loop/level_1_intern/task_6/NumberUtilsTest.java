package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_1_intern.task_6;

import teacher.codereview.CodeReviewComment;

@CodeReviewComment(teacher = "А где тест на негативный сценарий?", student = "Fixed, parametrized")
class NumberUtilsTest {

    void evenTest(int numberToTest, boolean expectedResult) {
        NumberUtils test = new NumberUtils();
        boolean realResult = test.isEven(numberToTest);
        System.out.println("Even test OK: " + (expectedResult == realResult));
    }

    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.evenTest(2, true);
        test.evenTest(1, false);
    }
}
