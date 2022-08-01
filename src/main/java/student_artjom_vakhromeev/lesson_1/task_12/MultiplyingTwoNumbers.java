package student_artjom_vakhromeev.lesson_1.task_12;

import java.util.Scanner;

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