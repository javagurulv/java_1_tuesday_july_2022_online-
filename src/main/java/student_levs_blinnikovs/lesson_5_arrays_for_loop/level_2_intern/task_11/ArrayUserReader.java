package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_2_intern.task_11;

/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3;
 - заполните каждую ячейку массива числом, запрошенным у пользователя;
 - выведите значение каждой ячейки на консоль.

 */

import java.util.Scanner;

class ArrayUserReader {
    public static void main(String[] args) {
        int[] numArray = new int[3];

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter 3 array element numbers below.");

        for (int i = 0; i < numArray.length; i++) {
            System.out.println("Enter " + (i + 1) + ". array element: ");
            numArray[i] = userInput.nextInt();
        }

        System.out.println("Here is your array: ");

        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }


    }
}
