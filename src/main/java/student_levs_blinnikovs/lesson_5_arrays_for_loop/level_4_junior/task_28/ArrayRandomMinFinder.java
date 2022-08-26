package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_4_junior.task_28;

/*
Напишите программу, в которой:
- создайте массив произвольной длины;
- заполните массив случайными числами;
- распечатайте на консоль все элементы массива;
- найдите наименьшее число в массиве и выведите его на консоль.
 */

import student_levs_blinnikovs.lesson_5_arrays_for_loop.level_5_6_7.task_31_41.ArrayUtil;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayRandomMinFinder {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] randomNumbers = arrayUtil.createRandomLengthArray();
        arrayUtil.fillArrayWithRandomNumbers(randomNumbers);
        arrayUtil.printArrayToConsole(randomNumbers);
        int minElement = arrayUtil.findMinNumber(randomNumbers);
        System.out.println("Min element is: " + minElement);
    }
}
