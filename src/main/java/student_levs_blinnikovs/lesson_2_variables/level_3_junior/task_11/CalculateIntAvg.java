package student_levs_blinnikovs.lesson_2_variables.level_3_junior.task_11;

/*

Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).

Примечение: обратите внимание, что результат может быть дробным числом.

 */

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CalculateIntAvg {

    static double calculateAvg(int var1, int var2, int var3) {
        return (double) (var1 + var2 + var3) / 3;
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("This program will calculate double average from your three integer input. Please enter 3 values below: ");

        System.out.println("First integer: ");
        int userInputOne = userInput.nextInt();

        System.out.println("Second integer: ");
        int userInputTwo = userInput.nextInt();

        System.out.println("Third integer: ");
        int userInputThree = userInput.nextInt();

        double result = calculateAvg(userInputOne, userInputTwo, userInputThree);
        System.out.println("Average result is: " + result);

    }

}
