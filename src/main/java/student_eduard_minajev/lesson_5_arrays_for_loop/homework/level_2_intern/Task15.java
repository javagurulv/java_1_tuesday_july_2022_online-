/*  - создайте массив целых чисел длиной 10; Done
 - заполните каждую ячейку массива случайным числом; Done
 - выведите значение каждой ячейки на консоль; Done
 - увеличьте значение каждой ячейки на 2; Done
 - выведите значение каждой ячейки на консоль. Done */

package student_eduard_minajev.lesson_5_arrays_for_loop.homework.level_2_intern;

import java.util.Random;

public class Task15 {


    public static void main (String[] args) {

        int[] randomArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
            System.out.println(randomArray[i]);
        }
        int[] randomArrayPlusTwo = new int [10];
        for (int i = 0; i < randomArrayPlusTwo.length; i++) {
            randomArrayPlusTwo[i] = randomArray[i] + 2;
            System.out.println(randomArrayPlusTwo[i]);
        }





    }
}
