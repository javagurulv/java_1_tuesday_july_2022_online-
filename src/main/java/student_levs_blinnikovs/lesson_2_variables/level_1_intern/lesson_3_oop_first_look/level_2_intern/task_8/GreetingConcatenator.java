package student_levs_blinnikovs.lesson_2_variables.level_1_intern.lesson_3_oop_first_look.level_2_intern.task_8;

/*
Учимся работать со строками.

Тема: Конкатенация строк.

Напишите программу в которой создайте переменную
типа String и присвойте ей в качестве начального значения
ваше имя. Выведете на консоль приветствие типа "Hi YourName".

Подсказка: любые две строки можно соединять знаком "+".

    String userName = "Viktor";
    String greeting = "Hi "
 */

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;
import static student_levs_blinnikovs.lesson_2_variables.level_1_intern.lesson_3_oop_first_look.level_2_intern.task_8.GreetingLanguage.*;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Что это за использование static и свойств класса? "
		+ "Зачем это нужно? Вы понимаете смысл static?", student = "Fixed")
public class GreetingConcatenator {

    public static String doGreet(String firstName, GreetingLanguage language) {
        String greeting;
        switch (language) {
            case EN:
                greeting = "Hello";
                break;
            case ES:
                greeting = "Hola";
                break;
            case LV:
                greeting = "Labdien";
                firstName = firstName.substring(0, firstName.length()-1); // LV specific Vocative call (works bad with women names)
                break;
            case PL:
                greeting = "Witaj";
                break;
            case RU:
                greeting = "Приветствую";
                break;
            default:
                greeting = "Hi";
        }
        return greeting + ", " + firstName + "!";
    }

    public static void main(String[] args) {
        System.out.println(doGreet("John", EN));
        System.out.println(doGreet("Piotr", PL));
        System.out.println(doGreet("Jānis", LV));
        System.out.println(doGreet("Иван", RU));
        System.out.println(doGreet("Julio", ES));
    }

}
