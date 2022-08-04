package student_artjom_vakhromeev.lesson_1.task_12;

import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "int num1, num2, sum; - объявлять все переменные в "
		+ "начале метода не надо! Объявление переменной должно быть там "
		+ "где ее первый раз используете.")

@CodeReviewComment(teacher = "sum; - sum = num1 * num2; - переменная "
		+ "sum названа неправильно! В ней хранится не сумма!")
class MultiplyingTwoNumbers {


     public static void main(String[] args) {

       int  num1,num2,sum;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first number :");
         num1 = sc.nextInt();

         System.out.println("Enter second number :");
         num2 = sc.nextInt();

         sum = num1 * num2;
         System.out.println("Sum of these numbers :" + sum);
     }


 }