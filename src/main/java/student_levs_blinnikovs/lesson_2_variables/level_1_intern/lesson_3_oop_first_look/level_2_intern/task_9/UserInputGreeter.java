package student_levs_blinnikovs.lesson_2_variables.level_1_intern.lesson_3_oop_first_look.level_2_intern.task_9;

/*
Учимся работать со строками.

Тема: Считывание строк с консоли.

Программа должна спрашивать как зовут пользователя,
считывать его имя с консоли и выводить приветствие
в виде: "Hello UserName!".

Подсказка: строку с консоли можно считать используя
обьект Scanner. Загуглите как это можно сделать:
"как в Java считать строку с консоли".
 */

import student_levs_blinnikovs.lesson_2_variables.level_1_intern.lesson_3_oop_first_look.level_2_intern.task_8.GreetingConcatenator;
import student_levs_blinnikovs.lesson_2_variables.level_1_intern.lesson_3_oop_first_look.level_2_intern.task_8.GreetingLanguage;
import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class UserInputGreeter extends GreetingConcatenator {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello, what's your name? Enter below: ");
        String userName = userInput.next();

        System.out.println("What language do you speak?");
        System.out.println("Enter EN for English, RU for Russian, LV for Latvian, PL for Polish, EN for Spanish: ");
        String language = userInput.next();
        GreetingLanguage greetingLanguage = GreetingLanguage.valueOf(language.toUpperCase());

        System.out.println(doGreet(userName, greetingLanguage));

    }

}