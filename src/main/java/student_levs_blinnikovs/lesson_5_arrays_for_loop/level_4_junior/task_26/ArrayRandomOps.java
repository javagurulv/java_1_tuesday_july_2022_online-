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

import student_levs_blinnikovs.lesson_5_arrays_for_loop.level_5_6_middle.task_31_x.ArrayUtil;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayRandomOps {

    public static void main(String[] args) {

        System.out.println("Please choose array length (integer): ");
        Scanner userInput = new Scanner(System.in);
        int arrayLength = userInput.nextInt();

        ArrayUtil arrayUtil = new ArrayUtil();

        int[] randomNumbers = arrayUtil.createArray(arrayLength);

        System.out.println("Random will fill in your array. ");
        arrayUtil.fillArrayWithRandomNumbers(randomNumbers);

        System.out.println("Your array: ");
        arrayUtil.printArrayToConsole(randomNumbers);

    }

}
