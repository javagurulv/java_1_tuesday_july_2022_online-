package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_4_junior.task_27;

/*
Напишите программу, в которой:
- создайте массив произвольной длины;
- заполните массив случайными числами;
- распечатайте на консоль все элементы массива;
- найдите наибольшее число в массиве и выведите его на консоль.
 */

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayRandomMaxFinder {



    public static void main(String[] args) {

        System.out.println("System will create random (from 1 up to 10) length array: ");
        Random random = new Random();
        int arrayLength = random.nextInt(9) + 1;
        System.out.println("System decided to create array with length of " + arrayLength);

        int[] userDefinedArr = new int[arrayLength];

        System.out.println("System now also will fill in your array (up to value of 10). ");

        for (int i = 0; i < userDefinedArr.length; i++) {
            userDefinedArr[i] = random.nextInt(10);
        }

        System.out.println("Your array: ");
        for (int i = 0; i < userDefinedArr.length; i++) {
            System.out.print(userDefinedArr[i] + " ");
        }

        System.out.println("System now will print highest element: ");

        int maxElement = userDefinedArr[0];
        for (int i = 0; i < userDefinedArr.length; i++) {
            if (maxElement < userDefinedArr[i]) {
                maxElement = userDefinedArr[i];
            }
        }

        System.out.println("Max element is: " + maxElement);

    }

}
