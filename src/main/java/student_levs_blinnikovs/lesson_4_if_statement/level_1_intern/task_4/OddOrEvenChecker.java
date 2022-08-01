package student_levs_blinnikovs.lesson_4_if_statement.level_1_intern.task_4;

/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль чётное оно или нет.

Подсказка: используйте для определения чётное число или нет
операцию остаток от деления (%). Если остаток от деления на 2
равен нулю то число чётное, иначе не чётное.
 */

import java.util.Scanner;

class OddOrEvenChecker {

    int userInput;

    OddOrEvenChecker(int userInput) {
        this.userInput = userInput;
    }

    boolean isEven() {
        return this.userInput % 2 == 0;
    }

}

class OddOrEvenCheckerDemo {

    public static void main(String[] args) {

        System.out.println("Enter integer - system will determine whether it's even.");
        Scanner userKeys = new Scanner(System.in);
        int savedUserInput = userKeys.nextInt();

        OddOrEvenChecker testData = new OddOrEvenChecker(savedUserInput);
        System.out.println("It's " + testData.isEven() + " that " + savedUserInput + " is even.");

    }

}