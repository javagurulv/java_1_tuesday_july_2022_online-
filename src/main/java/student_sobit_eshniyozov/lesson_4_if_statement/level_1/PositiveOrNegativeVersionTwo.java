package student_sobit_eshniyozov.lesson_4_if_statement.level_1;

import java.util.Scanner;

public class PositiveOrNegativeVersionTwo {

    public static void main(String[] args) {

        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Write any number: ");
        number = sc.nextInt();

        String result = (number >= 0) ? "Number is Positive!" : "Number is Negative!";
        System.out.println(result);
    }
}
