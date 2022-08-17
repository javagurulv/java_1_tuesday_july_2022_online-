package student_yurii_panasiuk.lesson_4.level_1_intern;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        System.out.println("Введите целое чило");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            if (number > 0) {
                System.out.println("Число положительное");
            }
                else  {
                System.out.println("Число равно нулю");
                  }
            }
    }
}
