package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_2_intern.task_14;

/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3;
 - заполните каждую ячейку массива случайным числом;
 - посчитайте среднее значение и выведите его на консоль.
 */

import java.util.Random;

class ArrayRandomizerAvgCalculator {
    public static void main(String[] args) {

        int[] randomNumbers = new int[3];

        Random random = new Random();

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
        }

        int elementSum = 0;

        for (int randomNumber : randomNumbers) {
            elementSum += randomNumber;
        }

        int elementAvg = elementSum / randomNumbers.length;

        System.out.println("Elements average is: " + elementAvg);

    }
}
