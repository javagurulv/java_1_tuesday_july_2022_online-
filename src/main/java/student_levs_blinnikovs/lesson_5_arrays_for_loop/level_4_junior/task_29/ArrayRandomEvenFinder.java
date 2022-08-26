package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_4_junior.task_29;

/*
Напишите программу, в которой:
- создайте массив произвольной длины;
- заполните массив случайными числами;
- распечатайте на консоль все элементы массива;
- найдите все чётные числа в массиве и выведите их на консоль.
 */

import student_levs_blinnikovs.lesson_5_arrays_for_loop.level_5_6_7.task_31_41.ArrayUtil;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayRandomEvenFinder {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] randomNumbers = arrayUtil.createRandomLengthArray();
        arrayUtil.fillArrayWithRandomNumbers(randomNumbers);
        arrayUtil.printArrayToConsole(randomNumbers);
        arrayUtil.findEvenNumbers(randomNumbers);
    }
}
