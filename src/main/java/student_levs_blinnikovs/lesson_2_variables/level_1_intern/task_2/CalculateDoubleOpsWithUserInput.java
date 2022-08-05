package student_levs_blinnikovs.lesson_2_variables.level_1_intern.task_2;

/*

Написать консольную программу, которая запрашивает у пользователя два вещественных числа
(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
Вещественные числа можно запрашивать с консоли используя обьект Scanner
следующим образом:

    Scanner scanner = new Scanner(System.in);
    double firstDoubleNumber = scanner.nextDouble();

 */


import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CalculateDoubleOpsWithUserInput {

    // Sum method
    public static double doubleSum(double var1, double var2) {
        return var1 + var2;
    }

    // Subtraction
    public static double doubleSubtract(double var1, double var2) {
        return var1 - var2;
    }

    // Product
    public static double doubleProduct(double var1, double var2) {
        return var1 * var2;
    }

    //Divide
    public static double doubleDivision(double var1, double var2) {
        return var1 / var2;
    }

    public static void main(String[] args) {

        // Creating user input object
        Scanner userInput = new Scanner(System.in);

        System.out.println("This program will sum, subtract, multiply and divide your two numbers (double) of choice.");
        System.out.println("Please use '.' dot delimiter and not ','. Validation to be implemented. \n");
        System.out.println("Please enter first double: ");
        double userDoubleOne;
        userDoubleOne = userInput.nextDouble();

        System.out.println("Please enter second double: ");
        double userDoubleTwo;
        userDoubleTwo = userInput.nextDouble();

        System.out.println("Results: \n");
        System.out.println("Sum is: " + doubleSum(userDoubleOne, userDoubleTwo));
        System.out.println("Subtraction result is: " + doubleSubtract(userDoubleOne, userDoubleTwo));
        System.out.println("Product is: " + doubleProduct(userDoubleOne, userDoubleTwo));
        System.out.println("Division result is: " + doubleProduct(userDoubleOne, userDoubleTwo));

    }

}
