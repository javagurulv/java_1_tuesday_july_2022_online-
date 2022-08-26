package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_4_junior.task_25;

/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива;
- создайте массив указанной пользователем длины;
- заполните массив числами полученными от пользователя;
- распечатайте на консоль все элементы массива.
 */

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayOps {

    public static void main(String[] args) {

        System.out.println("Please choose array length (integer): ");
        Scanner userInput = new Scanner(System.in);
        int arrayLength = userInput.nextInt();

        int[] userDefinedNumbers = new int[arrayLength];

        System.out.println("Please fill in your desired array. ");
        for (int i = 0; i < userDefinedNumbers.length; i++) {
            System.out.println("Enter value of " + (i + 1) + ". element:");
            userDefinedNumbers[i] = userInput.nextInt();
        }

        System.out.println("Your array: ");
        for (int i = 0; i < userDefinedNumbers.length; i++) {
            System.out.print(userDefinedNumbers[i] + " ");
        }

    }

}
