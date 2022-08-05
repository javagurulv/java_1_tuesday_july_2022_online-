package student_olegs_radigins.lesson_2.homework.level3.task9;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("напишите целое число: ");
        int userInputNumber = scanner.nextInt();


        for (int i = 1; i < 11; i++ ) {
            System.out.println(userInputNumber + "*" + i + "=" + (userInputNumber * i) );  }

    }
}
