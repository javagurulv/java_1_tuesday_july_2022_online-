package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_4_junior.task_28;

/*
Напишите программу, в которой:
- создайте массив произвольной длины;
- заполните массив случайными числами;
- распечатайте на консоль все элементы массива;
- найдите наименьшее число в массиве и выведите его на консоль.
 */

import java.util.Random;

import student_levs_blinnikovs.lesson_5_arrays_for_loop.level_5_6_middle.task_31_x.ArrayUtil;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayRandomMinFinder {



    public static void main(String[] args) {

        System.out.println("System will create random (from 1 up to 10) length array: ");
        Random random = new Random();
        int arrayLength = random.nextInt(9) + 1;
        System.out.println("System decided to create array with length of " + arrayLength);

        ArrayUtil arrayUtil = new ArrayUtil();

        int[] randomNumbers = arrayUtil.createArray(arrayLength);

        System.out.println("System now also will fill in your array (up to value of 10). ");
        arrayUtil.fillArrayWithRandomNumbers(randomNumbers);

        System.out.println("Your array: ");
        arrayUtil.printArrayToConsole(randomNumbers);

        System.out.println("System now will print min element: ");
        int minElement = arrayUtil.findMinNumber(randomNumbers);

        System.out.println("Min element is: " + minElement);

    }

}
