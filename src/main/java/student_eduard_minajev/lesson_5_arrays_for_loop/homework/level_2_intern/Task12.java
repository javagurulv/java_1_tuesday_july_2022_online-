/* Напишите программу, в которой:
 - создайте массив целых чисел длиной 3;
 - заполните каждую ячейку массива случайным числом;
 - выведите значение каждой ячейки на консоль.
 */

package student_eduard_minajev.lesson_5_arrays_for_loop.homework.level_2_intern;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task12 {

    public static void main(String[] args){

        Random random = new Random();
        int [] array = new int [3];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }

    }

}
