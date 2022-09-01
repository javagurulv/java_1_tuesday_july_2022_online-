package student_roman_hytt.lesson_4.level_1.task_3;

import java.util.Scanner;

public class EqualsOrDifferent {

    public static void main(String[] args) {
        System.out.println("Write number your first number");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Write number your second number");
        int secondNumber = scanner.nextInt();
        if (firstNumber == secondNumber) {
            System.out.println("Your numbers are equals");
        } else {System.out.println("Your numbers are different");

        }
    }}