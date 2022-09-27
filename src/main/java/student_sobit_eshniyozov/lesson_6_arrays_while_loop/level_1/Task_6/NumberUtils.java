package student_sobit_eshniyozov.lesson_6_arrays_while_loop.level_1.Task_6;


//          Напишите тесты для проверки метода isEven(int number).
//          Упростите работу метода, код внутри может быть написан в одну строку.

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Можно и проще return number % 2 == 0;")
class NumberUtils {

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
