package student_ivan_mostepanov.lesson_4_if_statement.level_1_intern;

import java.util.Scanner;

class Task1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Number is Positive!");
        }
        if (number < 0) {
            System.out.println("Number is Negative!");
        }

    }
}
