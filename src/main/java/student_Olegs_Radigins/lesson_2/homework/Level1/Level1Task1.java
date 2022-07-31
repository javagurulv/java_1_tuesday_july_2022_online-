package student_Olegs_Radigins.lesson_2.homework.Level1;


import java.util.Scanner;

public class Level1Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        int summa = firstNumber + secondNumber;
        int minus = firstNumber - secondNumber;
        int multyply = firstNumber * secondNumber;
        System.out.println("Сумма чисел = " + summa);
        System.out.println("Разница чисел = " + minus);
        System.out.println("Произведение чисел = " + multyply);

if(secondNumber == 0 ) {
    System.out.println("Для деления число не может быть ноль.");
}else{
    int division = firstNumber / secondNumber;
        System.out.println("Деление чисел = " + division);}
}
}