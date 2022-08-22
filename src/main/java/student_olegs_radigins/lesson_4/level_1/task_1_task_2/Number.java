package student_olegs_radigins.lesson_4.level_1.task_1_task_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        if (number < 0){
            System.out.println("Number is negative!");
        } else if (number == 0){
            System.out.println("Number is zero!");
        } else {
            System.out.println("Number is positive!");
        }
    }

}
