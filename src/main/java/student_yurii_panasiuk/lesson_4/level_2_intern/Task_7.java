package student_yurii_panasiuk.lesson_4.level_2_intern;

import java.util.Scanner;

public class Task_7 {

    public static void main(String[] args) {
        System.out.println("Введите чило первое целое число");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        System.out.println("Введите чило второе целое число");
        int number2 = scanner.nextInt();

        if (number1 == number2) { System.out.println("Numbers are equals"); }

        else { System.out.println("Numbers are different"); }
    }

}
