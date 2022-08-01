package student_Olegs_Radigins.lesson_2.homework.level1;

import java.util.Scanner;

public class Level1Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double secondDoubleNumber = scanner.nextDouble();

        double summa = firstDoubleNumber + secondDoubleNumber;
        double minus = firstDoubleNumber - secondDoubleNumber;
        double multyply = firstDoubleNumber * secondDoubleNumber;
        System.out.println("Сумма чисел = " + summa);
        System.out.println("Разница чисел = " + minus);
        System.out.println("Произведение чисел = " + multyply);

        if(secondDoubleNumber == 0 ) {
            System.out.println("Для деления число не может быть ноль.");
        }else{
            double division = firstDoubleNumber / secondDoubleNumber;
            System.out.println("Деление чисел = " + division);}
    }
}
