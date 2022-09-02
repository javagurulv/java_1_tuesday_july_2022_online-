package student_sobit_eshniyozov.lesson_5_arrays_for_loop.level_4.Task_26;
//        Напишите программу, в которой:
//        - запросите у пользователя с консоли длину массива;
//        - создайте массив указанной пользователем длины;
//        - заполните массив случайными числами;
//        - распечатайте на консоль все элементы массива.

import java.util.Scanner;

class MyArrayRandom {
    public static void main(String[] args) {

        System.out.println("Write length of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] group = new int[n];
        int j = 1;
        for (int i = 0; i < group.length; i++) {
            group[i] = ((int)(Math.random() * 222));
            System.out.println((j++)+". "+group[i]);
        }
    }
}
