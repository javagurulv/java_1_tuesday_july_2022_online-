package student_andrei_kholiavskii.lesson_2_variables.level_3_junior.task_9;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class MultiplicationTable {

    public static void main(String[] args){

        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Enter number: ");

        int userNumber = numberScanner.nextInt();

        System.out.println(userNumber + " x 1 = " + userNumber * 1 );
        System.out.println(userNumber + " x 2 = " + userNumber * 2 );
        System.out.println(userNumber + " x 3 = " + userNumber * 3 );
        System.out.println(userNumber + " x 4 = " + userNumber * 4 );
        System.out.println(userNumber + " x 5 = " + userNumber * 5 );
        System.out.println(userNumber + " x 6 = " + userNumber * 6 );
        System.out.println(userNumber + " x 7 = " + userNumber * 7 );
        System.out.println(userNumber + " x 8 = " + userNumber * 8 );
        System.out.println(userNumber + " x 9 = " + userNumber * 9 );
        System.out.println(userNumber + " x 10 = " + userNumber * 10 );
    }
}
