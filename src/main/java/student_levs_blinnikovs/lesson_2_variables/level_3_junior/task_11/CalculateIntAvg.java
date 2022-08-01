package student_levs_blinnikovs.lesson_2_variables.level_3_junior.task_11;

/*

Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).

Примечение: обратите внимание, что результат может быть дробным числом.

 */

import java.util.Scanner;

class CalculateIntAvg {

    static int userInputOne;
    static int userInputTwo;
    static int userInputThree;

    static double calculateAvg(int var1, int var2, int var3) {
        return (double) (var1 + var2 + var3) / 3;
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("This program will calculate double average from your three integer input. Please enter 3 values below: ");

        System.out.println("First integer: ");
        userInputOne = userInput.nextInt();

        System.out.println("Second integer: ");
        userInputTwo = userInput.nextInt();

        System.out.println("Third integer: ");
        userInputThree = userInput.nextInt();

        System.out.println("Average result is: ");
        System.out.println(calculateAvg(userInputOne, userInputTwo, userInputThree));

    }

}
