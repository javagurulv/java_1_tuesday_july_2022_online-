package student_artjom_vakhromeev.lesson_2.Task_1;

import java.util.Scanner;

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
