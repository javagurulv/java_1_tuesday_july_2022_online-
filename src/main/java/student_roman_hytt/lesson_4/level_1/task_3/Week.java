package student_roman_hytt.lesson_4.level_1.task_3;

import java.util.Scanner;

public class Week {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write your number");
        int firstNumber = scanner.nextInt();

        if (firstNumber == 1) {
            System.out.println("Monday");
        } else if (firstNumber == 2) {
            System.out.println("Tuesday");
        }
    }
}