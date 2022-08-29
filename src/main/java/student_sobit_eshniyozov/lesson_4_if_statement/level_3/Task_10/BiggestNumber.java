package student_sobit_eshniyozov.lesson_4_if_statement.level_3.Task_10;

//        Написать программу, которая запрашивает у пользователя
//        три целых числа и выводит на консоль наибольшее из них.
//
//        PS: перед решением этой задачи распишите на бумаге
//        или в коментарии все возможные варианты (комбинации).
//        Это поможет вам правильно написать программу!
//        Нельзя пользоваться классом Math.

/*              v stadii razrabotki

*/

class BiggestNumber {
    int numberOne;
    int numberTwo;
    int numberThree;

    BiggestNumber(int numberOne, int numberTwo, int numberThree) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;
    }

    void showBiggestNumber() {
        if (numberOne > numberTwo) {
        System.out.println(numberThree);
        }
    }
}
