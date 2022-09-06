/* Напишите тесты для проверки метода isEven(int number).
Упростите работу метода, код внутри может быть написан в одну строку.

class NumberUtils {

    public boolean isEven(int number) {
         if (number % 2 == 0) {
             return true;
         } else {
             return false;
         }
    }

}*/

package student_eduard_minajev.lesson_6_arrays_while_loop.level_1_intern;

// Буду честен, гуглил вопрос :) Пишут, что нужно тернарный оператор исспользовать.

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
public class NumberUtils {

// метод записан
	@CodeReviewComment(teacher = "смотри src/main/java/teacher/lesson_6_arrays_while_loop/codereview/CleanCodeWarning_1.txt")
	@CodeReviewComment(teacher = "смотри src/main/java/teacher/lesson_6_arrays_while_loop/codereview/CleanCodeWarning_2.txt")
    public boolean isEven(int number) {return (number % 2 == 0) ? true : false;}

}




