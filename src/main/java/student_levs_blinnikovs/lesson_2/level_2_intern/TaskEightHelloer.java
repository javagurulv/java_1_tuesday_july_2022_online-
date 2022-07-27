package student_levs_blinnikovs.lesson_2.level_2_intern;

/*
Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:

Hello имя пользователя!
 */

import java.util.Scanner;

public class TaskEightHelloer {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please write your name: ");
        System.out.println("Hello, " + userInput.next());

    }

}
