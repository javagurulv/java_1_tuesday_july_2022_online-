package student_sobit_eshniyozov.lesson_2.homework.level_1;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
            // Version 1
            // 1. get first number from user
            Scanner scanner = new Scanner( System.in );
            System.out.println("Enter first number: ");
            int firstNumber = scanner.nextInt();

            // 2. get second number from user
            System.out.println("Enter second number: ");
            int secondNumber = scanner.nextInt();

            // 3. first number + second number
            int resultOne = firstNumber + secondNumber;
            int resultTwo = firstNumber - secondNumber;
            int resultThree = firstNumber * secondNumber;
            int resultFour = firstNumber / secondNumber;

            // 4. print result to console
            System.out.println("Result = " + resultOne+"\n");

            System.out.println("Results: \n");
            System.out.println("Sum is: " + resultOne);
            System.out.println("Subtraction result is: " + resultTwo);
            System.out.println("Product is: " + resultThree);
            System.out.println("Division result is: " + resultFour);

    }
   }
