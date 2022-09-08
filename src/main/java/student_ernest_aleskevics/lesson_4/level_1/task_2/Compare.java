package student_ernest_aleskevics.lesson_4.level_1.task_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Compare {

    public static void main(String[] args) {

        Scanner inPut = new Scanner (System.in);
        System.out.println("Please enter integer number: ");
        int number = inPut.nextInt();

        if (number > 0){
            System.out.println("Number is positive!");
        } else if (number < 0) {
            System.out.println("Number is negative!");
        } else if (number == 0) {
            System.out.println("Number is null!");
        }

    }
}
