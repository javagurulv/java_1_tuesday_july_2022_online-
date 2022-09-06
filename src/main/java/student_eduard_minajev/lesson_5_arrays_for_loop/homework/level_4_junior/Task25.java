/* Напишите программу, в которой:
- запросите у пользователя с консоли длину массива;
- создайте массив указанной пользователем длины;
- заполните массив числами полученными от пользователя;
- распечатайте на консоль все элементы массива. */

package student_eduard_minajev.lesson_5_arrays_for_loop.homework.level_4_junior;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task25 {

    public static void main (String[] args){

        System.out.println("Please enter the length of an array. For your convenience, don't go above 10! ");
        Scanner scanner = new Scanner(System.in);
        int userArrayLength = scanner.nextInt();
        int [] userArray = new int[userArrayLength];

        System.out.println("Now fill this array with your numbers.");
        Scanner userNumber = new Scanner(System.in);
        for (int i = 0; i< userArray.length; i++) {
            userArray[i] = userNumber.nextInt() ;
            System.out.println(userArray[i]);
        }

    }

}
