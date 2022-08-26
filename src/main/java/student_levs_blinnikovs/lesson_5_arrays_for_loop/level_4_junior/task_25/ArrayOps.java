package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_4_junior.task_25;

/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива;
- создайте массив указанной пользователем длины;
- заполните массив числами полученными от пользователя;
- распечатайте на консоль все элементы массива.
 */

import student_levs_blinnikovs.lesson_5_arrays_for_loop.level_5_6_7.task_31_41.ArrayUtil;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayOps {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = arrayUtil.getArrayLengthWithUserInput();
        int[] userDefinedNumbers = arrayUtil.createArray(arrayLength);
        arrayUtil.fillArrayWithUserInput(userDefinedNumbers);
        arrayUtil.printArrayToConsole(userDefinedNumbers);
    }
}
