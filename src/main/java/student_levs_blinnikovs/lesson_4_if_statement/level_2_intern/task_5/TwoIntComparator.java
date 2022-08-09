package student_levs_blinnikovs.lesson_4_if_statement.level_2_intern.task_5;

/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наибольшее из них.
Нельзя пользоваться классом Math, можно использовать только if else.
 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TwoIntComparator {

    int numberOne;
    int numberTwo;

    TwoIntComparator(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    String printHigherNumber() {
        if (this.numberOne > this.numberTwo) {
            return "Higher number is " + this.numberOne;
        } else if (this.numberOne < this.numberTwo) {
            return "Higher number is " + this.numberTwo;
        } else return "Numbers are equal!";
    }

}
