package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_2_intern.task_15;

/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3;
 - заполните каждую ячейку массива случайным числом;
 - выведите значение каждой ячейки на консоль;
 - увеличьте значение каждой ячейки на 2;
 - выведите значение каждой ячейки на консоль.
 */

import student_levs_blinnikovs.lesson_5_arrays_for_loop.level_5_6_7.task_31_41.ArrayUtil;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayOps {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] randomNumbers = arrayUtil.createArray(3);
        arrayUtil.fillArrayWithRandomNumbers(randomNumbers);
        arrayUtil.printArrayToConsole(randomNumbers);
        int[] incrementedNumbers = arrayUtil.incrementEachElementBy(randomNumbers, 2);
        arrayUtil.printArrayToConsole(incrementedNumbers);
    }
}
