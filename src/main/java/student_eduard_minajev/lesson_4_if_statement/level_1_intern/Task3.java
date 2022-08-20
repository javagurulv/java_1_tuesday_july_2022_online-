package student_eduard_minajev.lesson_4_if_statement.level_1_intern;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args){

        System.out.println("Please enter number from 1 to 7!");
        Scanner dayScanner = new Scanner(System.in);

        int dayNumber = dayScanner.nextInt();

        if (dayNumber == 1) {
            System.out.println("Monday.");
        } else if (dayNumber == 2) {
            System.out.println("Tuesday.");

        } else if (dayNumber == 3) {
            System.out.println("Wednesday.");

        } else if (dayNumber == 4) {
            System.out.println("Thursday.");

        } else if (dayNumber == 5) {
            System.out.println("Friday");

        } else if (dayNumber == 6) {
            System.out.println("Saturday.");

        } else if (dayNumber == 7) {
            System.out.println("Sunday.");

        }
        else {
            System.out.println("Not in range!");

    }



    }



}
