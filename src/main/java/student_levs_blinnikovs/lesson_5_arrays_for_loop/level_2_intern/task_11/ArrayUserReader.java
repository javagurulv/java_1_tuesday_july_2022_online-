package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_2_intern.task_11;

/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3;
 - заполните каждую ячейку массива числом, запрошенным у пользователя;
 - выведите значение каждой ячейки на консоль.

 */

import java.util.Scanner;

import student_levs_blinnikovs.lesson_5_arrays_for_loop.level_5_6_7.task_31_41.ArrayUtil;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUserReader {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(3);
        arrayUtil.fillArrayWithUserInput(numbers);
        arrayUtil.printArrayToConsole(numbers);
    }
}
