package student_ernest_aleskevics.lesson_2.homework.level_3_junior.task_9;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Multiplication {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println ("Input a number: ");
        int n = in.nextInt();
        System.out.println("Expected Output: ");
        for (int x = 1; x <= 10; x++ ) {
            System.out.println(n + "*" + x + "=" + n * x);

        }

    }

}

