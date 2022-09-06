package student_yurii_panasiuk.lesson_5.level_4_junior;

import java.util.Scanner;

import teacher.codereview.CodeReview;

/*Напишите программу, в которой:
- запросите у пользователя с консоли длину массива;
- создайте массив указанной пользователем длины;
- заполните массив числами полученными от пользователя;
- распечатайте на консоль все элементы массива.

 */

@CodeReview(approved = true)
public class Task_25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter arrays length");
        Integer[] numbers = new Integer[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter "+ i + " value of array");
            numbers[i]=scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }


}
