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

public class StringConcatenator {

    static String userName = "Lev";
    static String greeting = "Hi, ";

    public static String doGreet(String userFirstName) {
        return greeting + userFirstName;
    }

    public static void main(String[] args) {
        System.out.println(doGreet(userName));
    }

}
