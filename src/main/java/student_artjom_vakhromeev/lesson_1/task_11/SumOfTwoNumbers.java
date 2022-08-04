package student_artjom_vakhromeev.lesson_1.task_11;

import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "int num1, num2, sum; - объявлять все переменные в "
		+ "начале метода не надо! Объявление переменной должно быть там "
		+ "где ее первый раз используете.")
class SumOfTwoNumbers {
        public static void main(String[] args) {

            int num1, num2, sum;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Number: ");
            num1 = sc.nextInt();

            System.out.println("Enter Second Number: ");
            num2 = sc.nextInt();

            sum = num1 + num2;
            System.out.println("Sum = " + sum);
        }
}


