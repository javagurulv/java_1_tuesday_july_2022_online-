package student_eduard_minajev.lesson_4_if_statement.level_2_intern;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task7 {

    public static void main(String[] args) {

        System.out.println("Please enter first number!");
        Scanner numberA = new Scanner(System.in);
        int numberOne = numberA.nextInt();

        System.out.println("Please enter second number");
        Scanner numberB = new Scanner(System.in);
        int numberTwo = numberB.nextInt();

        if (numberOne == numberTwo){
            System.out.println("Numbers are equal!");
        }else {
            System.out.println("Numbers are different!");
        }


    }
}