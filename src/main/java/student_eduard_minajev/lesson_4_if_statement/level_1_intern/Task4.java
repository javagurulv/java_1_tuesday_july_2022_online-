package student_eduard_minajev.lesson_4_if_statement.level_1_intern;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task4 {

    public static void main(String[] args) {

        System.out.println("Please define a whole number!");
        Scanner numberScanner = new Scanner(System.in);

        int number = numberScanner.nextInt();
        int divier = 2;
        int residual = number % divier;

        if (residual == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
