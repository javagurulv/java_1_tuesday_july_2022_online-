package student_ivan_mostepanov.lesson_6_arrays_while_loop.level_1_intern.task_6;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "А где тест на негативный сценарий?")
class NumberUtilsTest {



public  static  void main(String[]args) {


    NumberUtilsTest numberUtilstest = new NumberUtilsTest();
    numberUtilstest.isEvenTest();

}
    private void isEvenTest() {


        int number = 8;

        boolean expectedResult = true;
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }

    }
}
