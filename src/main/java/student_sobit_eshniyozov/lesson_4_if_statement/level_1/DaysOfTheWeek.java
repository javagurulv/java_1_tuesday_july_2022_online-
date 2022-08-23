package student_sobit_eshniyozov.lesson_4_if_statement.level_1;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Write any number: ");
        number = sc.nextInt();

        if (number == 1) {
            System.out.println("Today is Monday!");
        }
        if (number == 2) {
            System.out.println("Today is Tuesday!");
        }
        if (number == 3) {
            System.out.println("Today is Wednesday!");
        }
        if (number == 4) {
            System.out.println("Today is Thursday!");
        }
        if (number == 5) {
            System.out.println("Today is Friday!");
        }
        if (number == 6) {
            System.out.println("Today is Saturday!");
        }
        if (number == 7) {
            System.out.println("Today is Sunday");
        }

        if (number <= 0 || number > 7) {
            System.out.println("EROR!!!");
        }
    }
}
