package student_levs_blinnikovs.lesson_4_if_statement.level_1_intern.task_1;

/*
Написать программу, которая запрашивает у
пользователя
целое число и выводит на консоль
положительное оно или отрицательное.
 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SignChecker {

    int number;

    SignChecker(int number) {
        this.number = number;
    }

    void printPosOrNeg() {
        if (this.number >= 0) { System.out.println("Number " + this.number + " is positive."); }
        else System.out.println("Number " + this.number + " is negative.");
    }

}


