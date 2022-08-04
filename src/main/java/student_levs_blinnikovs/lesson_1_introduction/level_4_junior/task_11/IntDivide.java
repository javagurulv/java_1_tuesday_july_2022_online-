package student_levs_blinnikovs.lesson_1_introduction.level_4_junior.task_11;

/*

Write a Java program to divide two numbers and print on the screen.
Test Data :
50/3
Expected Output :
16

 */

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Что это за использование static и свойств класса? "
		+ "Зачем это нужно? Вы понимаете смысл static?", student = "Fixed")
class IntDivide {

    // Function returns division result of 2 integer values
    static int intDivide(int int1, int int2) {
        if (int2 != 0) {
            return int1 / int2;
        } else {
            System.out.println("Can't divide by zero!");
            return -1;
        }
    }

    public static void main(String[] args) {

        System.out.println("Input two integers, system will calculate division. Remember. Can't divide by zero.");
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int savedInput1 = userInput.nextInt();

        System.out.println("Enter second number. Make sure it's not zero: ");
        int savedInput2 = userInput.nextInt();

        int result = intDivide(savedInput1, savedInput2);
        System.out.println("Result of division: " + result);
    }
}
