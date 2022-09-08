package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_1_intern.task_6;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "А где тест на негативный сценарий?")
class NumberUtilsTest {

    void isEvenTest() {
        NumberUtils test = new NumberUtils();
        int evenNumber = 2;
        boolean expectedResult = true;
        boolean realResult = test.isEven(evenNumber);
        boolean testResult = expectedResult == realResult;
        System.out.println("Test OK: " + testResult);
    }

    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.isEvenTest();
    }
}
