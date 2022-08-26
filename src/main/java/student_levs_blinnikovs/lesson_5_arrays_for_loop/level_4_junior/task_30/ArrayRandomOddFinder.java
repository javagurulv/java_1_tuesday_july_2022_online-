package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_4_junior.task_30;

/*
Напишите программу, в которой:
- создайте массив произвольной длины;
- заполните массив случайными числами;
- распечатайте на консоль все элементы массива;
- найдите все нечётные числа в массиве и выведите их на консоль.
 */

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayRandomOddFinder {

    public static void main(String[] args) {

        System.out.println("System will create random (from 1 up to 10) length array: ");
        Random random = new Random();
        int arrayLength = random.nextInt(9) + 1;
        System.out.println("System decided to create array with length of " + arrayLength);

        int[] userDefinedNumbers = new int[arrayLength];

        System.out.println("System now also will fill in your array (up to value of 10). ");

        for (int i = 0; i < userDefinedNumbers.length; i++) {
            userDefinedNumbers[i] = random.nextInt(10);
        }

        System.out.println("Your array: ");
        for (int i = 0; i < userDefinedNumbers.length; i++) {
            System.out.print(userDefinedNumbers[i] + " ");
        }

        System.out.println("System now will print only odd elements: ");

        for (int i = 0; i < userDefinedNumbers.length; i++) {
            if (userDefinedNumbers[i] % 2 != 0) {
                System.out.println(userDefinedNumbers[i] + " is odd.");
            }
        }

    }

}
