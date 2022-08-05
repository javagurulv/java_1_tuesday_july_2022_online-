package student_sobit_eshniyozov.lesson_2.homework.level_1;

import java.util.Scanner;

public class TestScsnnerTwo {
           public static void main(String[] args) {

            // Version 2
            // 1. get first number from user
            Scanner scannerTwo = new Scanner( System.in );
            System.out.println("Enter first number: ");
            double thirdNumber = scannerTwo.nextDouble();

            // 2. get second number from user
            System.out.println("Enter second number: ");
            double fourthNumber = scannerTwo.nextDouble();

            // 3. first number + second number
            double resultFive = thirdNumber + fourthNumber;
            double resultSix = thirdNumber - fourthNumber;
            double resultSeven = thirdNumber * fourthNumber;
            double resultEight = thirdNumber / fourthNumber;

            // 4. print result to console
            System.out.println("Result = " + resultFive+"\n");

            System.out.println("Results: \n");
            System.out.println("Sum is: " + resultFive);
            System.out.println("Subtraction result is: " + resultSix);
            System.out.println("Product is: " + resultSeven);
            System.out.println("Division result is: " + resultEight);

        }
    }
