package student_yurii_panasiuk.lesson_4.level_3_junior;

/*
Write a program that accepts three numbers from the user and prints:
- "increasing" if the numbers are in increasing order,
- "decreasing" if the numbers are in decreasing order,
- "Neither increasing or decreasing order" otherwise.
 */

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {
        System.out.println("Введите чило первое целое число");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        System.out.println("Введите чило второе целое число");
        int number2 = scanner.nextInt();

        System.out.println("Введите чило третье целое число");
        int number3 = scanner.nextInt();


        if (number3 > number2 && number2 > number1) {
            System.out.println("increasing");
        }

        else if (number1 > number2 && number2 > number3) {
            System.out.println("decreasing");
        }
        else {
            System.out.println("Neither increasing or decreasing order");
        }


    }
}