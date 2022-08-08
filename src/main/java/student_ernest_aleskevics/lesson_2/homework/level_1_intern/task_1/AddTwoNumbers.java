package student_ernest_aleskevics.lesson_2.homework.level_1_intern.task_1;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class AddTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();

        int resultSum = firstNumber + secondNumber;
        int resultSubtract = firstNumber - secondNumber;
        int resultDivide = firstNumber / secondNumber;
        int resultMultiply = firstNumber * secondNumber;

        System.out.println("Sum of number :" + resultSum);
        System.out.println("Subtract of number :" + resultSubtract);
        System.out.println("Divide of number :" + resultDivide);
        System.out.println("Multiply of number :" + resultMultiply);


    }
}
