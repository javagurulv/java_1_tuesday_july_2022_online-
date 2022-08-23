package student_sobit_eshniyozov.lesson_4_if_statement.level_1;

import java.util.Scanner;

public class PositiveOrNegativeVersionWithZero {
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Write any number: ");
        number = sc.nextInt();

        if (number > 0) {
            System.out.println("Number is Positive!");
        }

        if (number < 0) {
            System.out.println("Number is Negative!");
        }

        if (number == 0) {
            System.out.println("Number is Zero!");
        }
    }
}
