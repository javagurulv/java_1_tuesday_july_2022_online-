package student_yurii_panasiuk.lesson_2.level_1_2_intern;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TaskL1T1 {

    public static void main(String[] args) {

        System.out.println("enter the first number"); // вводим числа с помощью Scanner
            Scanner scanner = new Scanner(System.in);
            int firstNumber = scanner.nextInt();
        System.out.println("enter the second number");
            int secondNumber = scanner.nextInt();

    int addition = firstNumber+secondNumber; // записываем в переменные результаты сложения, вычитания, умножения и деления.
    int subtraction1 = firstNumber-secondNumber;
    int subtraction2 = secondNumber-firstNumber;
    int multiplication = firstNumber*secondNumber;
    int division1 = firstNumber/secondNumber;
    int division2 = secondNumber/firstNumber;

    System.out.println("результат сложения " + addition); // выводим в консоль результаты
    System.out.println("результат вычитания второго числа из первого " + subtraction1);
    System.out.println("результат вычитания первого числа из вторго " + subtraction2);
    System.out.println("результат умножения " + multiplication);
    System.out.println("результат деления первого числа на второе " + division1);
    System.out.println("результат деления второго числа на первое "+ division2);


    }

}
