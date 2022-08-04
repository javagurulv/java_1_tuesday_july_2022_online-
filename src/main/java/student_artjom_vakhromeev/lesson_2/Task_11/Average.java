package student_artjom_vakhromeev.lesson_2.Task_11;

import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "num1 - не используется, ее надо удалить!")
public class Average {
    public static void main(String[] args) {
        double num1,num2,num3,average;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  first number :");
        double num = sc.nextDouble();

        System.out.println("Enter second number :");
        num2 = sc.nextDouble();

        System.out.println("Enter third number :");
        num3 = sc.nextDouble();

        average = num + num2 + num3 / 3 ;
        System.out.println("Average =" + average );
    }
}
