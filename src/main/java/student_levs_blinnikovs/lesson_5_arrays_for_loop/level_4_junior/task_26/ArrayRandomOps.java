package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_4_junior.task_26;

/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива;
- создайте массив указанной пользователем длины;
- заполните массив случайными числами;
- распечатайте на консоль все элементы массива.
 */

import student_levs_blinnikovs.lesson_5_arrays_for_loop.level_5_6_7.task_31_41.ArrayUtil;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayRandomOps {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = arrayUtil.getArrayLengthWithUserInput();
        int[] randomNumbers = arrayUtil.createArray(arrayLength);
        arrayUtil.fillArrayWithRandomNumbers(randomNumbers);
        arrayUtil.printArrayToConsole(randomNumbers);
    }
}
