package student_roman_hytt.lesson_4.level_1;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class PositiveOrNegative {
    public static void main(String[] args) {
        System.out.println("Please write you number!");

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        if ( firstNumber > -1 ){
            System.out.println( firstNumber +" Number is positive ");}

        else System.out.println(firstNumber+ " Number is negative");

        if ( firstNumber ==0){
            System.out.println( " Your number iz zerro ");}
    }


}



