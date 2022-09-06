package student_yurii_panasiuk.lesson_5.level_4_junior;

import java.util.Arrays;
import java.util.Scanner;

import teacher.codereview.CodeReview;

/*Напишите программу, в которой:
- создайте массив произвольной длины;
- заполните массив случайными числами;
- распечатайте на консоль все элементы массива;
- найдите наибольшее число в массиве и выведите его на консоль.

 */

@CodeReview(approved = true)
public class Task_27 {

    public static void main(String[] args) {

        int randomUpperLevel =10;
        int randomLowerLevel =1;
        Integer[] numbers = new Integer[(int) (randomLowerLevel+Math.random() * randomUpperLevel)];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=(int) (randomLowerLevel+Math.random() * randomUpperLevel);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        Arrays.sort(numbers);
        System.out.print("\n"+numbers[(numbers.length-1)]) ;
    }
}
