package student_levs_blinnikovs.lesson_4_if_statement.level_1_intern.task_4;

/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль чётное оно или нет.

Подсказка: используйте для определения чётное число или нет
операцию остаток от деления (%). Если остаток от деления на 2
равен нулю то число чётное, иначе не чётное.
 */

class OddOrEvenChecker {

    int userInput;

    OddOrEvenChecker(int userInput) {
        this.userInput = userInput;
    }

    boolean isEven() {
        return this.userInput % 2 == 0;
    }

}