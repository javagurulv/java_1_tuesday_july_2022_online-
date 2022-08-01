package student_levs_blinnikovs.lesson_4_if_statement.level_1_intern.task_2;

/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль
положительное оно, отрицательное или равно нулю.
 */

import java.util.Scanner;

class InputSignChecker {

    int userInput;

    InputSignChecker(int userInput) {
        this.userInput = userInput;
    }

    void printInputSign() {
        if (this.userInput > 0) {
            System.out.println(this.userInput + " is a positive number.");
        } else if (this.userInput == 0) {
            System.out.println(this.userInput + " is a nil.");
        } else if (this.userInput < 0) {
            System.out.println(this.userInput + " is a negative number.");
        } else System.err.println("Error, not a number!");
    }

}

class InputSignCheckerDemo {
    public static void main(String[] args) {

        System.out.println("Please enter the number, system will check if it's positive, negative or nil: ");
        Scanner userInput = new Scanner(System.in);
        int savedUserInput = userInput.nextInt();

        InputSignChecker numberToCheck = new InputSignChecker(savedUserInput);
        numberToCheck.printInputSign();

    }
}
