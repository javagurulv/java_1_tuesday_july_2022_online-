package student_eduard_minajev.lesson_4_if_statement.level_3_junior;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task9 {

    public static void main(String[] args){
        System.out.println("Please enter first number!");
        Scanner numberA = new Scanner(System.in);
        int numberOne = numberA.nextInt();

        System.out.println("Please enter second number");
        Scanner numberB = new Scanner(System.in);
        int numberTwo = numberB.nextInt();

        System.out.println("Please enter third number");
        Scanner numberC = new Scanner(System.in);
        int numberThree = numberC.nextInt();

        if ((numberOne > numberTwo) && (numberTwo > numberThree)){
            System.out.println("Decreasing");
        } else if ((numberOne < numberTwo) && (numberTwo < numberThree)) {
            System.out.println("Increasing");
        } else {
            System.out.println("Neither increasing or decreasing.");
        }


    }

}