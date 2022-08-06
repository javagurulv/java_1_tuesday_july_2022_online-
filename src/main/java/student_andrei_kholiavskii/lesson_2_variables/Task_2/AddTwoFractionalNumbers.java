package student_andrei_kholiavskii.lesson_2_variables.Task_2;

import java.util.Scanner;

public class AddTwoFractionalNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first fractional number: ");
        double firstDoubleNumber = scanner.nextDouble(); // get first number from user
        System.out.println("Enter second fractional number: ");
        double secondDoubleNumber = scanner.nextDouble(); // get second number from user

        double sum = firstDoubleNumber + secondDoubleNumber; // get sum of numbers
        double subtraction = firstDoubleNumber - secondDoubleNumber; // get subtraction of numbers
        double multiplication = firstDoubleNumber * secondDoubleNumber; // get multiplication of numbers
        double division = firstDoubleNumber / secondDoubleNumber; // get division of numbers

        System.out.println("Sum of numbers = " + sum);
        System.out.println("Substraction of numbers = " + subtraction);
        System.out.println("Multiplication of numbers = " + multiplication);
        System.out.println("Division of numbers = " + division);
    }
    }
