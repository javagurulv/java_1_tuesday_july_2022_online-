package student_sobit_eshniyozov.lesson_5_arrays_for_loop.level_4.Task_25;

//        Напишите программу, в которой:
//        - запросите у пользователя с консоли длину массива;
//        - создайте массив указанной пользователем длины;
//        - заполните массив числами полученными от пользователя;
//        - распечатайте на консоль все элементы массива.

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class MyArray {
    public static void main(String[] args) {

        System.out.println("Write length of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] group = new int[n];

        for (int i = 0; i < group.length; i++) {
            System.out.println("Write "+ (i+1) +" number of array:");
            group[i] = sc.nextInt();
        }
        for (int i = 0; i < group.length; i++) {
            System.out.println((i+1) + ". " + group[i]);
        }
    }
}
