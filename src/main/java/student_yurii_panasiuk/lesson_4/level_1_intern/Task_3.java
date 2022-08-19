package student_yurii_panasiuk.lesson_4.level_1_intern;

import java.util.Scanner;

 class Task_3 {

    public static void main(String[] args) {
    System.out.println("Введите целое чило от 1 до 7");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    switch (number) {
        case (1):System.out.println("Monday");  break;
        case (2):System.out.println("Tuesday"); break;
        case (3):System.out.println("Wednesday");   break;
        case (4):System.out.println("Thursday");    break;
        case (5):System.out.println("Friday");  break;
        case (6):System.out.println("Saturday");    break;
        case (7):System.out.println("Sunday");  break;
    }
//если искать описание switch можно найти такой пример, на 3 дня,
// про switch узнал из видео Java Programming Tutorial 21 - Switch Statement
    }
}
