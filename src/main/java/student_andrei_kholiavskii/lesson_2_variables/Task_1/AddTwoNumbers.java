package student_andrei_kholiavskii.lesson_2_variables.Task_1;

import java.util.Scanner;

public class AddTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt(); // get first number from user
        System.out.println("Enter second number: ");

        int secondNumber = scanner.nextInt(); // get second number from user
        int sum = firstNumber + secondNumber; // get sum of numbers
        int substraction = firstNumber - secondNumber; // get substraction of numbers
        int multiplication = firstNumber * secondNumber; // get multiplication of numbers
        int division = firstNumber / secondNumber; // get division of numbers

        System.out.println("Sum of numbers = " + sum);
        System.out.println("Substraction of numbers = " + substraction);
        System.out.println("Multiplication of numbers = " + multiplication);
        System.out.println("Division of numbers = " + division);
    }
}
