package student_Olegs_Radigins.lesson_2.homework.Level3.Task9;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("напишите целое число: ");
        int userInputNumber = scanner.nextInt();


        for (int i = 1; i < 11; i++ ) {
            System.out.println(userInputNumber + "*" + i + "=" + (userInputNumber * i) );  }

    }
}
