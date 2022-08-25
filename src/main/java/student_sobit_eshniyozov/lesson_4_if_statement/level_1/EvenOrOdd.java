package student_sobit_eshniyozov.lesson_4_if_statement.level_1;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Write any number: ");
        number = sc.nextInt();

        if (number%2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
