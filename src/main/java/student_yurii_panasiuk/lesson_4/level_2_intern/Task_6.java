package student_yurii_panasiuk.lesson_4.level_2_intern;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task_6 {

     static void main(String[] args) {
        System.out.println("Введите чило первое целое число");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        System.out.println("Введите чило второе целое число");
        int number2 = scanner.nextInt();

        if (number1 < number2) { System.out.println("Введенное первое число " + number1 + " меньше"); }

        else { System.out.println("Введенное второе число " + number2 + " меньше"); }
    }

}
