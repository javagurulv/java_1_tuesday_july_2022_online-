package student_andrei_kholiavskii.lesson_2_variables.task_11;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double userNumberOne = numberScanner.nextInt();

        System.out.println("Enter second number: ");
        double userNumberTwo = numberScanner.nextInt();

        System.out.println("Enter third number: ");
        double userNumberThree = numberScanner.nextInt();

        double averageResult = (userNumberOne + userNumberTwo + userNumberThree) / 3;

        System.out.println("Average of these numbers is: " + averageResult);
    }

}
