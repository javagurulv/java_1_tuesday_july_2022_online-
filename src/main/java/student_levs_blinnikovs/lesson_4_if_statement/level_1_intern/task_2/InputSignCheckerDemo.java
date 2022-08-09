package student_levs_blinnikovs.lesson_4_if_statement.level_1_intern.task_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class InputSignCheckerDemo {
    public static void main(String[] args) {

        System.out.println("Please enter the number, system will check if it's positive, negative or zero: ");
        Scanner userInput = new Scanner(System.in);
        int savedUserInput = userInput.nextInt();

        InputSignChecker numberToCheck = new InputSignChecker(savedUserInput);
        numberToCheck.printInputSign();

    }
}
