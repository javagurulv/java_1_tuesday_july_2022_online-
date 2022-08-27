package student_yurii_panasiuk.lesson_5.level_2_intern;

/*Напишите программу, в которой:
        - создайте массив целых чисел длиной 10;
        - заполните каждую ячейку массива числом, запрошенным у пользователя;
        - выведите значение каждой ячейки на консоль.

 */

import java.util.Scanner;

 class Task_11 {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[10];
        Scanner scanner = new Scanner(System.in);
        int i;
        for (i = 0; i < numbers.length; i++) {
            System.out.println("Enter "+ i + " value of array");
            numbers[i]=scanner.nextInt();
        }

        for (i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }


}
