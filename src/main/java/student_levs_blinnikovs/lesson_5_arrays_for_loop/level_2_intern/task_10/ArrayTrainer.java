package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_2_intern.task_10;

/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3;
 - заполните каждую ячейку массива любым целым числом;
 - выведите значение каждой ячейки на консоль.
 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayTrainer {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        numbers[0] = 1;
        numbers[1] = 100;
        numbers[2] = 1000;

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
