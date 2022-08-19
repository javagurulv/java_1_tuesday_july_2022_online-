package student_yurii_panasiuk.lesson_4.level_3_junior;

import java.util.Scanner;

/*
Write a Java program that accepts three numbers and prints:
- "All numbers are equal" if all three numbers are equal,
- "All numbers are different" if all three numbers are different
- "Neither all are equal or different" otherwise.
 */
public class Task_8 {

    public static void main(String[] args) {
        System.out.println("Введите чило первое целое число");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        System.out.println("Введите чило второе целое число");
        int number2 = scanner.nextInt();

        System.out.println("Введите чило третье целое число");
        int number3 = scanner.nextInt();

        if (number1 == number2 && number2 == number3 && number1 == number3 ) {
            System.out.println("All numbers are equal"); }

        else if (number1 != number2 && number2 != number3 && number2 != number1 ) {
            System.out.println("All numbers are different"); }

        else { System.out.println("Neither all are equal or different"); }
    }




}


