package student_levs_blinnikovs.lesson_1_introduction.level_4_junior.task_11;

/*

Напишите Java программу, которая выведет на консоль результат умножения двух чисел.
Числа можно придумать любые, их не надо запрашивать у пользователя.

Тестовые данные:
50 * 3
Ожидаемый результат:
150

 */

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Что это за использование static и свойств класса? "
		+ "Зачем это нужно? Вы понимаете смысл static?")
class IntProduct {

    // Input
    static int var1 = 50;
    static int var2 = 3;

    // Function returns product of 2 integer values
    public static int intProduct(int int1, int int2) {
        return int1 * int2;
    }

    public static void main(String[] args) {
        System.out.println("Result of multiplication: " + intProduct(var1, var2));
    }
}
