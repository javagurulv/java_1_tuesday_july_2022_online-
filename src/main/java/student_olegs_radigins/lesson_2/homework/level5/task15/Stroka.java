package student_olegs_radigins.lesson_2.homework.level5.task15;

import java.util.Scanner;

public class Stroka {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите  число: ");
        int number1 = scanner.nextInt();
        System.out.print("Мы написали число в той же строке и следующее сообщение продолжится здесь: ");


        System.out.println("Введите  число: ");
        int number2 = scanner.nextInt();
        System.out.print("Мы написали число в новой строке.");
    }
}
