package student_artjom_vakhromeev.lesson_2.Task_1;

import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "int num1, num2, sum; - объявлять все переменные в "
		+ "начале метода не надо! Объявление переменной должно быть там "
		+ "где ее первый раз используете.")

@CodeReviewComment(teacher = "sum; - sum = num1 * num2; - переменная "
		+ "sum названа неправильно! В ней хранится не сумма!")
class AdditionSubtractionMultiplicationDivision {
     public static void main(String[] args) {

         double num1,num2,sum;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first number :");
         num1 = sc.nextDouble();

         System.out.println("Enter second number :");
         num2=sc.nextDouble();

         sum = num1 - num2 ;
         System.out.println("Addition = " + sum);

          sum = num1 + num2 ;
         System.out.println("Subtraction = " + sum);

          sum  = num1 * num2;
         System.out.println("Multiplication " + sum);

         double average  = num1 / num2 ;
         System.out.println("division " + average);
     }
}
