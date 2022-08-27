package student_yurii_panasiuk.lesson_5.level_2_intern;

import java.util.Scanner;

/*Напишите программу, в которой:
 - создайте массив целых чисел длиной 10;
 - заполните каждую ячейку массива случайным числом;
 - выведите значение каждой ячейки на консоль.

 */

public class Task_12 {

    public static void main(String[] args) {

        Integer[] numbers = new Integer[10];
        int i;
        int randomUpperLevel =10;

        for (i = 0; i < numbers.length; i++) {

            numbers[i]=(int) (Math.random() * randomUpperLevel);
        }

        for (i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
