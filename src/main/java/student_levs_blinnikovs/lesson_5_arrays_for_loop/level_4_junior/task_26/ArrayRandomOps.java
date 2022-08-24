package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_4_junior.task_26;

/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива;
- создайте массив указанной пользователем длины;
- заполните массив случайными числами;
- распечатайте на консоль все элементы массива.
 */

import java.util.Random;
import java.util.Scanner;

class ArrayRandomOps {

    public static void main(String[] args) {

        System.out.println("Please choose array length (integer): ");
        Scanner userInput = new Scanner(System.in);
        int arrayLength = userInput.nextInt();

        int[] userDefinedArr = new int[arrayLength];

        System.out.println("Random will fill in your array. ");

        Random random = new Random();

        for (int i = 0; i < userDefinedArr.length; i++) {
            userDefinedArr[i] = random.nextInt(10);
        }

        System.out.println("Your array: ");
        for (int i = 0; i < userDefinedArr.length; i++) {
            System.out.print(userDefinedArr[i] + " ");
        }

    }

}