package student_eduard_minajev.lesson_4_if_statement.level_1_intern;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args){

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Please enter whole number!");

        int number = numberScanner.nextInt();

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        if (number > 0){
            System.out.println("Number is positive!");
        }
        if (number < 0){
            System.out.println("Number is negative!");
        }
        if (number == 0){
            System.out.println("Number is Zero!");
        }

    }



}
