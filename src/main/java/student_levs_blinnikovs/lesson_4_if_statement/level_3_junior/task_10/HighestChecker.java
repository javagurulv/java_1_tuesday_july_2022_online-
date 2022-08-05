package student_levs_blinnikovs.lesson_4_if_statement.level_3_junior.task_10;

/*
Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.

PS: перед решением этой задачи распишите на бумаге
или в коментарии все возможные варианты (комбинации).
Это поможет вам правильно написать программу!
Нельзя пользоваться классом Math.
 */

class HighestChecker {

    int firstNumber;
    int secondNumber;
    int thirdNumber;

    HighestChecker(int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    /*

    scenarios at first pos
    3 2 1
    3 1 2
    3 1 1   at first pos, other - same

    scenarios at middle pos
    1 3 2
    2 3 1
    1 3 1   at middle pos, other - same

    scenarios at last pos
    1 2 3
    2 1 3
    1 1 3   at last pos, other - same

    at least two the same
    1 3 3   two same, both (any of) is highest
    3 3 1
    3 1 3
    3 3 3   all same

     */

    int getHighest() {
        if (isFirstHighest() || areFirstTwoEquallyHigherThanThird() || areFirstAndLastEquallyHigherThanSecond()) {
            return firstNumber;
        } else if (isSecondHighest() || areFirstTwoEquallyHigherThanThird() || areLastTwoEquallyHigherThanFirst()) {
            return secondNumber;
        } else if (isThirdHighest() || areLastTwoEquallyHigherThanFirst() || areFirstAndLastEquallyHigherThanSecond()) {
            return thirdNumber;
        } else return firstNumber; // all three the same
    }

    boolean isFirstHighest() {
        return firstNumber > secondNumber && firstNumber > thirdNumber; // helper method to return first
    }

    boolean isSecondHighest() {
        return secondNumber > firstNumber && secondNumber > thirdNumber; // helper method to return second
    }

    boolean isThirdHighest() {
        return thirdNumber > firstNumber && thirdNumber > secondNumber; // helper method to return third
    }

    boolean areFirstTwoEqual () { // is this even needed... maybe better put inside areFirstTwoEquallyHigherThanThird()
        return firstNumber == secondNumber;
    }

    boolean areLastTwoEqual () {
        return secondNumber == thirdNumber;
    }

    boolean areFirstAndLastEqual () {
        return firstNumber == thirdNumber;
    }

    boolean areFirstTwoEquallyHigherThanThird() {
        return areFirstTwoEqual() && firstNumber > thirdNumber; // helper method to return first || second
    }

    boolean areLastTwoEquallyHigherThanFirst() {
        return areLastTwoEqual() && secondNumber > firstNumber; // helper method to return second || third
    }

    boolean areFirstAndLastEquallyHigherThanSecond() {
        return areFirstAndLastEqual() && firstNumber > secondNumber; // helper method to return first || third
    }

    // not sure if areAllEqual()  method is even needed. if areTwoEquallyHigh() == true, then it can print the highest number already. Question is which.

}