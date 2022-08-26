package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_4_junior.task_27;

/*
Напишите программу, в которой:
- создайте массив произвольной длины;
- заполните массив случайными числами;
- распечатайте на консоль все элементы массива;
- найдите наибольшее число в массиве и выведите его на консоль.
 */

import java.util.Random;

import student_levs_blinnikovs.lesson_5_arrays_for_loop.level_5_6_middle.task_31_x.ArrayUtil;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayRandomMaxFinder {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] randomNumbers = arrayUtil.createRandomLengthArray();
        arrayUtil.fillArrayWithRandomNumbers(randomNumbers);
        arrayUtil.printArrayToConsole(randomNumbers);
        int maxElement = arrayUtil.findMaxNumber(randomNumbers);
        System.out.println("Max element is: " + maxElement);
    }
}
