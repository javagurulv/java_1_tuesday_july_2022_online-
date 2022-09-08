package student_ivan_mostepanov.lesson_4_if_statement.level_3_junior;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number ");
        int secondNumber = sc.nextInt();
        System.out.println("Enter third number ");
        int thirdNumber = sc.nextInt();



        /*
        (x>y) & (y>z)=x
        (x<y) & (y>z)=y
        (x>y) & (x<z)=z
        (x<y) & (y<z)=z
        (x>y) & (y=z)=x
        (x<y) & (y=z)=y
        (x=y) & (x>z)=x
        (x=y) & (x<z)=z
        (x=z) & (y>z)=y
        (x=z) & (y<z)=z
        (x=y) & (y=z)=x
              */

        if (((firstNumber > secondNumber) && (secondNumber > thirdNumber)))
        {
            System.out.println("Number " + firstNumber + " is bigger");
        }
        else if (((firstNumber < secondNumber) && (secondNumber > thirdNumber)))
        {
            System.out.println("Number " + secondNumber + " is bigger");
        }
        else if (((firstNumber > secondNumber) && (firstNumber < thirdNumber)))
        {
            System.out.println("Number " + thirdNumber + " is bigger");
        }
        else if (((firstNumber < secondNumber) && (secondNumber < thirdNumber)))
        {
            System.out.println("Number " + thirdNumber + " is bigger");
        }
        else if (((firstNumber > secondNumber) && (secondNumber == thirdNumber)))
        {
            System.out.println("Number " + firstNumber + " is bigger");
        }
        else if (((firstNumber < secondNumber) && (secondNumber == thirdNumber)))
        {
            System.out.println("Number " + secondNumber + " is bigger");
        }
        else if (((firstNumber == secondNumber) && (firstNumber > thirdNumber)))
        {
            System.out.println("Number " + firstNumber + " is bigger");
        }
        else if (((firstNumber == secondNumber) && (secondNumber < thirdNumber)))
        {
            System.out.println("Number " + thirdNumber + " is bigger");
        }
        else if (((firstNumber == thirdNumber) && (secondNumber > thirdNumber)))
        {
            System.out.println("Number " + secondNumber + " is bigger");
        }
        else if (((firstNumber == thirdNumber) && (secondNumber < thirdNumber)))
        {
            System.out.println("Number " + thirdNumber + " is bigger");
        }
        else if (((firstNumber == secondNumber) && (secondNumber == thirdNumber)))
        {
            System.out.println("Number " + firstNumber + " is bigger");
        }

    }



}
