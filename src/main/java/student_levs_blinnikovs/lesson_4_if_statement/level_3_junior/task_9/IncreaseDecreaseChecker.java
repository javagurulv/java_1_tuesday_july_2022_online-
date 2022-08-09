package student_levs_blinnikovs.lesson_4_if_statement.level_3_junior.task_9;

/*
Write a program that accepts three numbers from the user and prints:
- "increasing" if the numbers are in increasing order,
- "decreasing" if the numbers are in decreasing order,
- "Neither increasing or decreasing order" otherwise.
 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class IncreaseDecreaseChecker {

    int firstNumber;
    int secondNumber;
    int thirdNumber;

    IncreaseDecreaseChecker(int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    String checkNumbers() {
        if (this.firstNumber < this.secondNumber && this.secondNumber < this.thirdNumber) {
            return "increasing";
        } else if (this.firstNumber > this.secondNumber && this.secondNumber > this.thirdNumber) {
            return "decreasing";
        } else return "Neither increasing or decreasing order";
    }

}
