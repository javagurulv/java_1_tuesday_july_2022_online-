package student_sobit_eshniyozov.lesson_5_arrays_for_loop.level_4.Task_27_30;

//        Напишите программу, в которой:
//        - создайте массив произвольной длины;
//        - заполните массив случайными числами;
//        - распечатайте на консоль все элементы массива;

// 1.         - найдите наибольшее число в массиве и выведите его на консоль.
// 2.         - найдите наименьшее число в массиве и выведите его на консоль.
// 3.         - найдите все чётные числа в массиве и выведите их на консоль.
// 4.         - найдите все нечётные числа в массиве и выведите их на консоль.

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class MyArrayAllVersions {
        public static void main(String[] args) {

                int s= 1; // для номерации

                System.out.println("Write length of array:");
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] group = new int[n];

                for (int i = 0; i < group.length; i++) {
                        group[i] = ((int)(Math.random() * 222));
                        System.out.println((s++)+". "+group[i]);
                }
                System.out.println("======================");
                // 1.         - найдите наибольшее число в массиве и выведите его на консоль.
                int maxNum = group[0];
                for (int i : group) {
                        if (i > maxNum)
                                maxNum = i;
                }
                System.out.println("Maximum number = " + maxNum);

                System.out.println("======================");
                // 2.         - найдите наименьшее число в массиве и выведите его на консоль.
                int minNum = group[0];
                for (int i : group) {
                        if (i < minNum)
                                minNum = i;
                }
                System.out.println("Minimum number = " + minNum);

                System.out.println("======================");
                // 3.         - найдите все чётные числа в массиве и выведите их на консоль.
                for (int i = 0; i< group.length; i++) {
                        if (group[i]%2==0){
                                System.out.println("Even numbers = "+group[i]);
                        }
                }

                System.out.println("======================");
                // 4.         - найдите все нечётные числа в массиве и выведите их на консоль.
                for (int i = 0; i< group.length; i++) {
                        if (group[i]%2!=0){
                                System.out.println("Odd numbers = "+group[i]);
                        }
                }
        }
}