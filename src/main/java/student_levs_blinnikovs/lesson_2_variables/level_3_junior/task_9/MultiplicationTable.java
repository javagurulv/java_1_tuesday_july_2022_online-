package student_levs_blinnikovs.lesson_2_variables.level_3_junior.task_9;

/*

Напишите программу, которая запрашивает у пользователя целое число
и печатает на консоль таблицу умножения для этого числа до 10.

Test Data:
Input a number: 8

Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80

 */

import java.util.Scanner;

class MultiplicationTable {

    static int userInputInt;

    static void calculateMultiplication(int inputInt) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(inputInt + " x " + i + " = " + i * inputInt);
        }
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("This program will print out multiplication table for desired integer. Please enter below: ");
        userInputInt = userInput.nextInt();

        System.out.println("Results: ");
        calculateMultiplication(userInputInt);
    }

}
