package student_Yurii_Panasiuk.L2;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.println("enter the first number"); // вводим числа с помощью Scanner
            Scanner scanner = new Scanner(System.in);
            double firstDoubleNumber = scanner.nextDouble();
        System.out.println("enter the second number");
            double secondDoubleNumber = scanner.nextDouble();

    double addition = firstDoubleNumber+secondDoubleNumber; // записываем в переменные результаты сложения, вычитания, умножения и деления.
    double subtraction1 = firstDoubleNumber-secondDoubleNumber;
    double subtraction2 = secondDoubleNumber-firstDoubleNumber;
    double multiplication = firstDoubleNumber*secondDoubleNumber;
    double division1 = firstDoubleNumber/secondDoubleNumber;
    double division2 = secondDoubleNumber/firstDoubleNumber;

    System.out.println("результат сложения " + addition); // выводим в консоль результаты
    System.out.println("результат вычитания второго числа из первого " + subtraction1);
    System.out.println("результат вычитания первого числа из вторго " + subtraction2);
    System.out.println("результат умножения " + multiplication);
    System.out.println("результат деления первого числа на второе " + division1);
    System.out.println("результат деления второго числа на первое "+ division2);

    }

}
