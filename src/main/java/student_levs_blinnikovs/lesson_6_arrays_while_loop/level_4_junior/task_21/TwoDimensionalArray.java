package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_4_junior.task_21;

/*
Создайте класс TwoDimensionalArray и в нём напишите программу в которой:
- создайте двумерный массив;
- заполните двумерный массив случайными числами;
- посчитайте сумму всех чисел в двумерном массиве.

Помните, что если вы видите часть кода, которую можно реализовать
отдельно от остальной программы, создайте для неё свой метод.
Воспользуйтесь созданным вами методом в основной программе
просто вызвав его. Развивайте и тренируйте умение разбивать
программу на методы на простых задачах, этот навык вам
в дальнейшем поможет справиться с более сложными задачами.
 */

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TwoDimensionalArray {
    public static void main(String[] args) {

        int[][] twoDimensionalArr = new int[2][3];

        Random random = new Random();

        for (int i = 0; i < twoDimensionalArr.length; i++) {
            for (int j = 0; j < twoDimensionalArr[0].length; j++) {
                twoDimensionalArr[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Your array: ");
        for (int i = 0; i < twoDimensionalArr.length; i++) {
            System.out.println("Array level " + (i + 1) + ": ");
            for (int j = 0; j < twoDimensionalArr[0].length; j++) {
                System.out.println("arr[" + i + "][" + j + "] = " + twoDimensionalArr[i][j]);
            }
        }

        System.out.println("Calculate sum: ");
        int sum = 0;
        for (int i = 0; i < twoDimensionalArr.length; i++) {
            for (int j = 0; j < twoDimensionalArr[0].length; j++) {
                sum = sum + twoDimensionalArr[i][j];
            }
        }

        System.out.println("Sum is: " + sum);

    }
}
