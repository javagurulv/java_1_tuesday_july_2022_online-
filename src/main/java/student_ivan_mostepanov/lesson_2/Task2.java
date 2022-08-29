package student_ivan_mostepanov.lesson_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task2 {

    public static void main(String[] args) {

    Scanner scanner =  new Scanner(System.in);
    System.out.println("Please enter first number: ");
    double firstDoubleNumber = scanner.nextDouble();

    System.out.println("Please enter second number: ");
    double secondDoubleNumber = scanner.nextDouble();


    double resoultSum = firstDoubleNumber + secondDoubleNumber;
    double resoultSubtraction = firstDoubleNumber - secondDoubleNumber;
    double resoultMulti = firstDoubleNumber * secondDoubleNumber;
    double resoultDivide = firstDoubleNumber / secondDoubleNumber;

    System.out.println(" Sum =  " + resoultSum);
    System.out.println(" Subtraction =  " + resoultSubtraction);
    System.out.println(" Multiply =  " + resoultMulti);
    System.out.println(" Divide = " + resoultDivide);

}
}
