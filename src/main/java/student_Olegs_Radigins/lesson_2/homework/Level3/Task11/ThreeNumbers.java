package student_Olegs_Radigins.lesson_2.homework.Level3.Task11;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Введите третее число: ");
        double thirdNumber = scanner.nextDouble();
        double average = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Среднее арифметическое трех чисел равно " + average);

    }
}
