package student_levs_blinnikovs.lesson_2_variables.level_2_intern.task_8;

/*
Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:

Hello имя пользователя!
 */

import java.util.Scanner;

class UserGreeter {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please write your name: ");
        System.out.println("Hello, " + userInput.next()); // is it better to create variable? If we don't have an intent to use it later? Should this operation even be in the System Out Prinln args.. I think I did not correctly

    }

}
