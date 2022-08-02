package student_levs_blinnikovs.lesson_4_if_statement.level_2_intern.task_6;

/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наименьшее из них.
 */

class TwoIntComparatorSmaller {

    int numberOne;
    int numberTwo;

    TwoIntComparatorSmaller(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    String printSmallerNumber() {
        if (this.numberOne < this.numberTwo) {
            return "Smaller number is " + this.numberOne;
        } else if (this.numberOne > this.numberTwo) {
            return "Smaller number is " + this.numberTwo;
        } else return "Numbers are equal!";
    }

}


