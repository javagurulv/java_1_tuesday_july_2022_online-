package student_levs_blinnikovs.lesson_2_variables.level_1_intern.task_1;

/*

Написать консольную программу, которая запрашивает у пользователя два целых числа и
выводит на консоль результаты:
сложения,
вычитания,
умножения и
деления.

1. Создать класс с нужным именем;
2. Создать описать main метод;
3. Воспользуйтесь специальным классом Scanner и его методом nextInt() для получения ввода с клавиатуры
          Scanner scanner = new Scanner(System.in);
          int firstNumber = scanner.nextInt();
4. Запишите полученные результаты в переменные;
5. При помощи System.out.println() выведите на консоль полученные результаты сложения, вычитания, умножения и деления.
 (каждый результат на новой строке отдельно).

 */


import java.util.Scanner;

class CalculateIntOpsWithUserInput {

    // Sum method
    public static int intSum(int var1, int var2) {
        return var1 + var2;
    }

    // Subtraction
    public static int intSubtract(int var1, int var2) {
        return var1 - var2;
    }

    // Product
    public static int intProduct(int var1, int var2) {
        return var1 * var2;
    }

    //Divide
    public static int intDivision(int var1, int var2) {
        return var1 / var2;
    }

    public static void main(String[] args) {

        // Creating user input object
        Scanner userInput = new Scanner(System.in);

        System.out.println("This program will sum, subtract, multiply and divide your two numbers (integers) of choice.");
        System.out.println("Please enter first number: ");
        int userIntOne;
        userIntOne = userInput.nextInt();

        System.out.println("Please enter second number: ");
        int userIntTwo;
        userIntTwo = userInput.nextInt();

        int intSumResult = intSum(userIntOne, userIntTwo);
        int intSubtractResult = intSubtract(userIntOne, userIntTwo);
        int intProductResult = intProduct(userIntOne, userIntTwo);
        int intDivisionResult = intDivision(userIntOne, userIntTwo);

        System.out.println("Results: \n");
        System.out.println("Sum is: " + intSumResult);
        System.out.println("Subtraction result is: " + intSubtractResult);
        System.out.println("Product is: " + intProductResult);
        System.out.println("Division result is: " + intDivisionResult);

    }

}
