package student_yurii_panasiuk.lesson_5.level_2_intern;

/* Напишите программу, в которой:
 - создайте массив целых чисел длиной 10;
 - заполните каждую ячейку массива случайным числом;
 - посчитайте сумму всех ячеек и распечатайте ее на консоль.

 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task_13 {
    public static void main(String[] args) {

        Integer[] numbers = new Integer[10];
        int i;
        int randomUpperLevel =10;
        int randomLoverLevel = 1;
        int numbersSum = 0;

        for (i = 0; i < numbers.length; i++) {

            numbers[i]=(int) (randomLoverLevel+Math.random() * randomUpperLevel);
        }

        for (i = 0; i < numbers.length; i++) {
          //  System.out.print(numbers[i] + " "); // print array to console
            numbersSum = numbersSum + numbers[i];

        }
        System.out.println("\n"+numbersSum);
    }


}
