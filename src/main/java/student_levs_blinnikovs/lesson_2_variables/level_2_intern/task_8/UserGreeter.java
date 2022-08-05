package student_levs_blinnikovs.lesson_2_variables.level_2_intern.task_8;

/*
Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:

Hello имя пользователя!
 */

import teacher.codereview.CodeReviewComment;

import java.util.Scanner;


@CodeReviewComment(student = "is it better to create variable? If we don't have an intent to use it later? Should this operation even be in the System Out Prinln args.. I think I did not correctly")
class UserGreeter {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please write your name: ");
        String savedUserName = userInput.next();
        System.out.println("Hello, " + savedUserName);

    }

}
