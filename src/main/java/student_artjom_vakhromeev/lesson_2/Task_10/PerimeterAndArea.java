package student_artjom_vakhromeev.lesson_2.Task_10;

import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "radius - не используется, ее надо удалить!")
public class PerimeterAndArea {
    public static void main(String[] args) {
        double radius,pi,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        double r = sc.nextDouble();
         pi = + 3.1415926 ;

        area = r * r * pi ;
        System.out.println("Area = " + area );
    }
}
