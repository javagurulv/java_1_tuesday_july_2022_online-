package student_roman_hytt.lesson_2.level_1_intern;

import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "double num1,num2,sum; - не надо объявлять все переменные в начале метода!")
public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber=scanner.nextDouble();
        double num1,num2,sum;
        num1=firstDoubleNumber;
        num2=scanner.nextDouble();
        sum =num1+num2;
        System.out.println("Result "+ sum);
        sum=num1-num2;
        System.out.println("Result "+ sum);
        sum=num1*num2;
        System.out.println("Result "+ sum);
        sum=num1/num2;
        System.out.println("Result "+ sum);



    }
        }



