package student_yurii_panasiuk.lesson_5.level_2_intern;

import java.util.Arrays;
import java.util.List;

/*Напишите программу, в которой:
 - создайте массив целых чисел длиной 10;
 - заполните каждую ячейку массива любым целым числом;
 - выведите значение каждой ячейки на консоль.
 */
 class Task_10 {
    public static void main(String[] args) {
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // массив из класса Integer можно преобразовать в список
        int i;
        int j=0;
        List numbersList = Arrays.asList(numbers);
        System.out.println (numbersList);                // вариант 1 через список


        for (i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
                                                       // вариант 2 цикл For
        System.out.print("\n");
       while (j<numbers.length) {
           System.out.print(numbers[j] + " ");
           j++;
       }                                                // вариант 3 цикл while


    }
}