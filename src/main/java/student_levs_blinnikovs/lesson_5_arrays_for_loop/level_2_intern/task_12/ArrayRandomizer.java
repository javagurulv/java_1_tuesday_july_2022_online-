package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_2_intern.task_12;

/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3;
 - заполните каждую ячейку массива случайным числом;
 - выведите значение каждой ячейки на консоль.
 */

import java.util.Random;

class ArrayRandomizer {
    public static void main(String[] args) {

        int[] randomNumbers = new int[3];

        Random random = new Random();

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
        }

        for (int randomNumber : randomNumbers) {
            System.out.println(randomNumber);
        }

    }
}
