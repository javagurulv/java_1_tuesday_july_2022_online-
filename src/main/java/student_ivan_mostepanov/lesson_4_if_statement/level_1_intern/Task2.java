package student_ivan_mostepanov.lesson_4_if_statement.level_1_intern;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task2 {

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
        if (number == 0) {
            System.out.println("Number is Zero!");
        }

    }
}
