package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_2_intern.task_15;

/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3;
 - заполните каждую ячейку массива случайным числом;
 - выведите значение каждой ячейки на консоль;
 - увеличьте значение каждой ячейки на 2;
 - выведите значение каждой ячейки на консоль.
 */

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayOps {

    public static void main(String[] args) {

        int[] randomNumbers = new int[3];

        Random random = new Random();

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(10);
        }

        System.out.println("Random numbers: ");
        for (int randomNumber : randomNumbers) {
            System.out.println(randomNumber);
        }

        int[] incrementedNumbers = new int[3];

        for (int i = 0; i < incrementedNumbers.length; i++) {
            incrementedNumbers[i] = randomNumbers[i] + 2;
        }

        System.out.println("\nIncremented numbers: ");
        for (int incrementedNumber : incrementedNumbers) {
            System.out.println(incrementedNumber);
        }

    }

}
