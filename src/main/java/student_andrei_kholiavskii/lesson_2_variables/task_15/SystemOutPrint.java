package student_andrei_kholiavskii.lesson_2_variables.task_15;

import java.util.Scanner;

public class SystemOutPrint {
    public static void main(String[] args){

    Scanner numberScanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
    double userNumberOne = numberScanner.nextInt();

        System.out.print("Enter second number: ");
    double userNumberTwo = numberScanner.nextInt();

        System.out.print("Enter third number: ");
    double userNumberThree = numberScanner.nextInt();

    double averageResult = (userNumberOne + userNumberTwo + userNumberThree) / 3;

        System.out.print("Average of these numbers is: " + averageResult);
}
}
