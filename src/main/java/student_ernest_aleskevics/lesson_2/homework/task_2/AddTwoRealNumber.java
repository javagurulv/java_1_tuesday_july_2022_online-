package student_ernest_aleskevics.lesson_2.homework.task_2;

import java.util.Scanner;

public class AddTwoRealNumber {
    /*
Написать консольную программу, которая запрашивает у пользователя два вещественных числа
(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
Вещественные числа можно запрашивать с консоли используя обьект Scanner
следующим образом:

 Scanner scanner = new Scanner(System.in);
 Double firstDoubleNumber = scanner.nextDouble();
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Please enter second number: ");
        double secondNumber = scanner.nextDouble();

        double resultSum = firstNumber + secondNumber;
        double resultSubtract = firstNumber - secondNumber;
        double resultDivide = firstNumber / secondNumber;
        double resultMultiply = firstNumber * secondNumber;

        System.out.println("Sum of number :" + resultSum);
        System.out.println("Subtract of number :" + resultSubtract);
        System.out.println("Divide of number :" + resultDivide);
        System.out.println("Multiply of number :" + resultMultiply);

    }


}
