/* Напишите программу, в которой:
 - создайте массив целых чисел длиной 3;
 - заполните каждую ячейку массива числом, запрошенным у пользователя;
 - выведите значение каждой ячейки на консоль. */

package student_eduard_minajev.lesson_5_arrays_for_loop.homework.level_2_intern;

import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Всё сделай через циклы!")
public class Task11 {

    public static void main(String[] args){

        System.out.println("Please enter 3 whole numbers!");

        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        int [] arrayOne = new int [] {numberOne, numberTwo, numberThree};

        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.println(numberThree);


    }



}
