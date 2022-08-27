/* Напишите программу, в которой:
 - создайте массив целых чисел длиной 3;
 - заполните каждую ячейку массива случайным числом;
 - посчитайте сумму всех ячеек и распечатайте ее на консоль.

 // постараемся вынести посчет суммы за пределы метода */

package student_eduard_minajev.lesson_5_arrays_for_loop.homework.level_2_intern;

import java.util.Random;



public class Task13 {

    public static void main (String [] args) {

        int [] randomArray = new int[3];
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = random.nextInt(10);
            System.out.println(randomArray[i]);
        }

        int sum = 0;
        for (int i = 0; i < randomArray.length; i ++){
            sum += randomArray[i];
        }
            System.out.println("The sum is " + sum);

    }



}
