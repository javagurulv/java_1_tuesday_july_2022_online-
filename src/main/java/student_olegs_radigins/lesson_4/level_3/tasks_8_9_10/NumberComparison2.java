package student_olegs_radigins.lesson_4.level_3.tasks_8_9_10;

import java.util.Scanner;

class NumberComparison2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter a second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter a third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber) {
            System.out.println("All numbers are different");
            if (firstNumber > secondNumber && firstNumber > thirdNumber) {
                System.out.println("The first number is greater.");
            } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
                System.out.println("The second number is greater.");
            } else {
                System.out.println("The third number is greater.");
            }
            System.out.println("Numbers decreasing: ");
            if (firstNumber > secondNumber && firstNumber > thirdNumber && secondNumber > thirdNumber) {
                System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
            } else if (firstNumber > thirdNumber && secondNumber < thirdNumber) {
                System.out.println(firstNumber + " " + thirdNumber + " " + secondNumber);
            } else if (secondNumber > firstNumber && secondNumber > thirdNumber && firstNumber > thirdNumber) {
                System.out.println(secondNumber + " " + firstNumber + " " + thirdNumber);
            } else if (secondNumber > thirdNumber) {
                System.out.println(secondNumber + " " + thirdNumber + " " + firstNumber);
            } else if (firstNumber > secondNumber) {
                System.out.println(thirdNumber + " " + firstNumber + " " + secondNumber);
            } else {
                System.out.println(thirdNumber + " " + secondNumber + " " + firstNumber);
            }

            System.out.println("Numbers increasing: ");
            if (firstNumber > secondNumber && firstNumber > thirdNumber && secondNumber > thirdNumber) {
                System.out.println(thirdNumber + " " + secondNumber + " " + firstNumber);
            } else if (firstNumber > thirdNumber && secondNumber < thirdNumber)
                System.out.println(secondNumber + " " + thirdNumber + " " + firstNumber);
            else if (secondNumber > firstNumber && secondNumber > thirdNumber && firstNumber > thirdNumber) {
                System.out.println(thirdNumber + " " + firstNumber + " " + secondNumber);
            } else if (secondNumber > thirdNumber) {
                System.out.println(firstNumber + " " + thirdNumber + " " + secondNumber);
            } else if (firstNumber > secondNumber) {
                System.out.println(secondNumber + " " + firstNumber + " " + thirdNumber);
            } else {
                System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
            }

        } else {
            if (firstNumber > secondNumber && firstNumber > thirdNumber) {
                System.out.println("The first number is greater.");
            } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
                System.out.println("The second number is greater.");
            } else if (firstNumber == secondNumber && firstNumber > thirdNumber) {
                System.out.println("The first and second numbers is greater.");
            } else if (firstNumber == thirdNumber) {
                System.out.println("The first and third numbers is greater.");
            } else if (secondNumber == thirdNumber) {
                System.out.println("The second and third numbers is greater.");
            } else {
                System.out.println("The third number is greater.");
            }

            System.out.println("Neither all are equal or different");
            System.out.println("Neither increasing or decreasing order");
        }
    }

}

