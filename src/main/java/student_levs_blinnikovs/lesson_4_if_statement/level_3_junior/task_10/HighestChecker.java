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

    321 at first pos
    312

    132 at middle pos
    231

    123 at last pos
    213

    311 at first pos, other - same
    131 at middle pos, other - same
    113 at last pos, other - same

    133 two similar, no highest
    331
    313

    333 all same

     */

    String checkHighest() {
        if (true) {
            return "..."; // TODO
        } else if (false) {
            return "...";
        } else return "Neither increasing or decreasing order";
    }

}