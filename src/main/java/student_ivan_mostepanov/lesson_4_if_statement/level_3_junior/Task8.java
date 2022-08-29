package student_ivan_mostepanov.lesson_4_if_statement.level_3_junior;

import java.util.Scanner;

class Task8 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number ");
        int secondNumber = sc.nextInt();
        System.out.println("Enter third number ");
        int thirdNumber = sc.nextInt();

        if ((firstNumber == secondNumber) && (secondNumber == thirdNumber))
    {
            System.out.println("All numbers are equal");
        }

        else if ((firstNumber != secondNumber) && (secondNumber != thirdNumber))
        {
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different ");
        }


    }





}
