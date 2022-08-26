/* Напишите программу, в которой:
 - создайте массив целых чисел длиной 3;
 - заполните каждую ячейку массива случайным числом;
 - посчитайте сумму всех ячеек и распечатайте ее на консоль.

 // постараемся вынести посчет суммы за пределы метода */

package student_eduard_minajev.lesson_5_arrays_for_loop.homework.level_2_intern;

import java.util.Random;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Всё сделай через циклы!")
public class Task13 {

    public static void main(String[] args){

        Random randomGenerator = new Random();

        int numberOne = randomGenerator.nextInt(50);
        int numberTwo = randomGenerator.nextInt(50);
        int numberThree = randomGenerator.nextInt(50);

        int [] arrayOne = new int[] {numberOne, numberTwo, numberThree};
        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.println(numberThree);

        int sum = numberOne + numberTwo + numberThree;
        System.out.println("Sum is " + sum);

    }

}
