package student_ivan_mostepanov.lesson_4_if_statement.level_1_intern;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = sc.nextInt();

        int divider = 2;
        int remainder = number % divider;

        if (remainder == 0) {
            System.out.println("Number is Even!");
        }
        else  {
                System.out.println("Number is Odd!");
            }

        }




}
