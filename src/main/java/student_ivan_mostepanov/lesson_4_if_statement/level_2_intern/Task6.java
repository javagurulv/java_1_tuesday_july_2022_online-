package student_ivan_mostepanov.lesson_4_if_statement.level_2_intern;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number ");
        int secondNumber = sc.nextInt();


        if (firstNumber < secondNumber) {
            System.out.println("Number " + firstNumber + " is smaller");
        }
        else if (firstNumber > secondNumber) {
            System.out.println("Number " + secondNumber + " is smaller ");
        }
        else {
            System.out.println("Numbers are the same");
        }

    }



}
