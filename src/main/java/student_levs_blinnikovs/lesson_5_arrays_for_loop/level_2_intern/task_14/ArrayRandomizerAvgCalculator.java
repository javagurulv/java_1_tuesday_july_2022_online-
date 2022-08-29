package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_2_intern.task_14;

/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3;
 - заполните каждую ячейку массива случайным числом;
 - посчитайте среднее значение и выведите его на консоль.
 */

import java.util.Random;

import student_levs_blinnikovs.lesson_5_arrays_for_loop.level_5_6_7.task_31_41.ArrayUtil;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayRandomizerAvgCalculator {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] randomNumbers = arrayUtil.createArray(3);
        arrayUtil.fillArrayWithRandomNumbers(randomNumbers);
        int elementAvg = arrayUtil.findElementAvg(randomNumbers);
        System.out.println("Elements average is: " + elementAvg);
    }
}
