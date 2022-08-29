package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_2_intern.task_13;

/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3;
 - заполните каждую ячейку массива случайным числом;
 - посчитайте сумму всех ячеек и распечатайте ее на консоль.
 */

import java.util.Random;

import student_levs_blinnikovs.lesson_5_arrays_for_loop.level_5_6_7.task_31_41.ArrayUtil;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayRandomizerSummer {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] randomNumbers = arrayUtil.createArray(3);
        arrayUtil.fillArrayWithRandomNumbers(randomNumbers);
        int elementSum = arrayUtil.findElementSum(randomNumbers);
        System.out.println("Total elements sum is: " + elementSum);
    }
}
