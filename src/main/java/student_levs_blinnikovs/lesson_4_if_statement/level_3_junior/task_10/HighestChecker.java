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

    at first pos
    3 2 1
    3 1 2

    at middle pos
    1 3 2
    2 3 1

    at last pos
    1 2 3
    2 1 3

    3 1 1   at first pos, other - same
    1 3 1   at middle pos, other - same
    1 1 3   at last pos, other - same

    1 3 3   two same, no highest
    3 3 1
    3 1 3

    333 all same

     */

    boolean areAllSame() {
        return firstNumber == secondNumber && firstNumber == thirdNumber;
    }

    String checkHighest() {
        if (areAllSame()) { // technically then highest is any number (?)
            return "All three numbers are same.";
        } else if (firstNumber > secondNumber && firstNumber > thirdNumber) { // first pos scenario + at first pos, other - same
            return "First number is highest. It's value is " + firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) { // second pos scenario + at middle pos, other - same
            return "Second number is highest. It's value is " + secondNumber;
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) { // last pos scenario + at last pos, other - same
            return "Third number is highest. It's value is " + thirdNumber;
        } else { // two similar, no highest ... technically then highest is one of those that are same (?)
            return "There is no highest number as two of the numbers are same.";
        }
    }

}