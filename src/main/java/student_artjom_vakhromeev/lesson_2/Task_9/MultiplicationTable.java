package student_artjom_vakhromeev.lesson_2.Task_9;

import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "int num1,sum; и название переменной sum!")
class MultiplicationTable {
     public static void main(String[] args) {
         int num1,sum;

         Scanner sc= new Scanner(System.in);
         System.out.println("Enter number :");
         num1 = sc.nextInt();

         sum = num1 * 1;
         System.out.println(+sum);

         sum = num1 * 2;
         System.out.println(+sum);

         sum = num1 * 3;
         System.out.println(+sum);

         sum = num1 * 4;
         System.out.println(+sum);

         sum = num1 * 5;
         System.out.println(+sum);

         sum = num1 * 6;
         System.out.println(+sum);

         sum = num1 * 7;
         System.out.println(+sum);

         sum = num1 * 8;
         System.out.println(+sum);

         sum = num1 * 9;
         System.out.println(+sum);

         sum = num1 * 10;
         System.out.println(+sum);
     }
}
