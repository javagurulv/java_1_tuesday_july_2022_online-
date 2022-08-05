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

    // find higher among 1 and 2 and write into highest result
    // find higher among result and 3. If result smaller, then third. otherwise first remains highest.


    int maxOfTwo(int first, int second) {
        return first > second ? first : second;
    }

    int getHighest() {
        return 0;
    }

}