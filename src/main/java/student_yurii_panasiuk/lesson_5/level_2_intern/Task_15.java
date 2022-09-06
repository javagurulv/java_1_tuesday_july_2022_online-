package student_yurii_panasiuk.lesson_5.level_2_intern;

/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 10;
 - заполните каждую ячейку массива случайным числом;
 - выведите значение каждой ячейки на консоль;
 - увеличьте значение каждой ячейки на 2;
 - выведите значение каждой ячейки на консоль.
 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task_15 {
    public static void main(String[] args) {

        Integer[] numbers = new Integer[10];
        int i;
        int randomUpperLevel =10;
        int randomLoverLevel =1;

        for (i = 0; i < numbers.length; i++) {

            numbers[i]=(int) (randomLoverLevel+Math.random() * randomUpperLevel);
        }

        for (i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " "); // print array to console

        }
        System.out.println();

        for (i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i]+2;
        }

        for (i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " "); // print array to console

        }

    }

}
