package student_ivan_mostepanov.lesson_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task1 {

	public static void main(String[] args) {

    Scanner scanner =  new Scanner(System.in);
    System.out.println("Please enter first number: ");
    int firstNumber = scanner.nextInt();

    System.out.println("Please enter second number: ");
    int secondNumber = scanner.nextInt();


    int resoultSum = firstNumber + secondNumber;
    int resoultSubtraction = firstNumber - secondNumber;
    int resoultMulti = firstNumber * secondNumber;
    int resoultDivide = firstNumber / secondNumber;

    System.out.println(" Sum =  " + resoultSum);
    System.out.println(" Subtraction =  " + resoultSubtraction);
    System.out.println(" Multiply =  " + resoultMulti);
    System.out.println(" Divide = " + resoultDivide);

}
}
