package student_artjom_vakhromeev.lesson_1.lesson_2.Task_2;

import java.util.Scanner;

class AdditionSubtractionMultiplicationDivision {

    public static void main(String[] args) {
        double num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
         num1 = sc.nextDouble() ;

        System.out.println("Enter second number :");
         num2 = sc.nextDouble() ;

        double average = num1 - num2;
        System.out.println("Addition - " + average);

        average = num1 + num2;
        System.out.println("Subtraction - " + average);

        average  = num1 * num2;
        System.out.println("Multiplication - " + average);

        average  = num1 / num2 ;
        System.out.println("Division - " + average);
    }
}
