/* Напишите программу, в которой:
 - создайте массив целых чисел длиной 3;
 - заполните каждую ячейку массива случайным числом;
 - выведите значение каждой ячейки на консоль.
 */

package student_eduard_minajev.lesson_5_arrays_for_loop.homework.level_2_intern;

import java.util.Random;

public class Task12 {

    public static void main(String[] args){

        Random randomOne = new Random();
        int numberOne = randomOne.nextInt(20);
        int numberTwo = randomOne.nextInt(20);
        int numberThree = randomOne.nextInt(20);

        int [] arrayTwo = new int[]{numberOne, numberTwo,numberThree};

        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.println(numberThree);

    }

}
