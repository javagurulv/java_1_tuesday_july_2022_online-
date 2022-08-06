package student_levs_blinnikovs.lesson_4_if_statement.level_3_junior.task_10;

/*
Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.

PS: перед решением этой задачи распишите на бумаге
или в коментарии все возможные варианты (комбинации).
Это поможет вам правильно написать программу!
Нельзя пользоваться классом Math.
 */

import teacher.codereview.CodeReviewComment;

@CodeReviewComment(student = "I think I've fixed.")
class HighestChecker {

    int firstNumber;
    int secondNumber;
    int thirdNumber;

    HighestChecker(int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    // 1. find highest among 1 and 2 and write result into highest at the moment
    // 2. next, find highest among highest at the moment result and 3rd.
    // 3. if highest at the moment result is higher than third, then answer is highest of first two - current highest result.
    // 4. Otherwise third number.

    int maxOfTwo(int firstNum, int secondNum) {
        return firstNum > secondNum ? firstNum : secondNum;
    }

    int getHighest() {
        int currentMax = maxOfTwo(firstNumber, secondNumber);
        currentMax = maxOfTwo(currentMax, thirdNumber);
        return currentMax;
    }

    /*

    alternatively ...

    int getHighest() {
        return maxOfTwo(maxOfTwo(firstNumber, secondNumber), thirdNumber)
    }

    but maybe current option is better for readability.

     */

        /*
    previous version... will delete after review

    int getHighest() {
        int currentMax = maxOfTwo(firstNumber, secondNumber);
        if (maxOfTwo(currentMax, thirdNumber) > thirdNumber) {
            return currentMax;
        } else return thirdNumber;
    }

     */

}