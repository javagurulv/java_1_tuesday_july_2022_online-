package student_ivan_mostepanov.lesson_4_if_statement.level_2_intern;

import java.util.Scanner;

class Task5 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number ");
        int secondNumber = sc.nextInt();


        if (firstNumber > secondNumber) {
            System.out.println("First number " + firstNumber + " is bigger than " +  secondNumber);
        }
        if (firstNumber < secondNumber) {
            System.out.println("Second number " + secondNumber + " is bigger than " + firstNumber);
        }
        else{
            System.out.println("Numbers are the same");
        }

    }



}
