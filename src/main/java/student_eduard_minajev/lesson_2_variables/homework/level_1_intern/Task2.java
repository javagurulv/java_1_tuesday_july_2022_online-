package student_eduard_minajev.lesson_2_variables.homework.level_1_intern;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System. in);
        System.out.println("Please Enter First Rational Number ");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("Please Enter First Rational Number ");
        double secondDoubleNumber = scanner.nextDouble();
        System.out.println("The results of basic operations between numbers are following: ");
        System.out.print("Addition: ");
        double resultAdd = firstDoubleNumber + secondDoubleNumber;
        System.out.println(resultAdd);
        System.out.print("Subtraction: ");
        double resultSubstraction = firstDoubleNumber - secondDoubleNumber;
        System.out.println(resultSubstraction);
        System.out.print("Multiplier: ");
        double resultMultiplier = firstDoubleNumber * secondDoubleNumber;
        System.out.println(resultMultiplier);
        System.out.print("Divide: ");
        double resultDivide = firstDoubleNumber / secondDoubleNumber;
        System.out.println(resultDivide);


    }
}
