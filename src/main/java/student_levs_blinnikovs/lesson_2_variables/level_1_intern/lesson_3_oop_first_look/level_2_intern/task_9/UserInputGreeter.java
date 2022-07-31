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

import student_levs_blinnikovs.lesson_2_variables.level_1_intern.lesson_3_oop_first_look.level_2_intern.task_8.StringConcatenator;

import java.util.Scanner;

public class UserInputGreeter extends StringConcatenator {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello, what's your name? Enter below: ");
        String userName = userInput.next();

        System.out.println(doGreet(userName));

    }

}