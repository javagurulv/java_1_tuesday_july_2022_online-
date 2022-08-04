package student_levs_blinnikovs.lesson_2_variables.level_1_intern.lesson_3_oop_first_look.level_2_intern.task_7;

/*
Учимся работать со строками.

Тема: создание переменной типа String.

Напишите программу в которой создайте переменную
типа String и присвойте ей в качестве начального значения
ваше имя. Выведете на консоль значение этой переменной.

Пример кода:

    String myName = "Viktor";
    System.out.println(myName);

 */

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Что это за использование static и свойств класса? "
		+ "Зачем это нужно? Вы понимаете смысл static?")
class NameSayer {

    static String myName = "Lev";

    public static void main(String[] args) {
        System.out.println(myName);
    }

}
