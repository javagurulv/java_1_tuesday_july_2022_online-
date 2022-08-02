package student_levs_blinnikovs.lesson_4_if_statement.level_2_intern.task_7;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль:
- "Numbers are equals" - если числа равны
- "Numbers are different" - если числа не равны
 */

class NumbersEqualChecker {

    int numberOne;
    int numberTwo;

    NumbersEqualChecker(int numberOne, int numberTwo) {
            this.numberOne = numberOne;
            this.numberTwo = numberTwo;
        }

        boolean isNumbersEqual() {
            return this.numberOne == this.numberTwo;
        }

        String printIsNumbersEqual() {
            if (this.isNumbersEqual()) {
                return "Numbers are equal";
            } else return "Numbers are different";
        }

    }

