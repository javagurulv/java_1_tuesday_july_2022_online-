package student_eduard_minajev.lesson_4_if_statement.level_1_intern;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args){

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Please enter");
        int selectedNumber = numberScanner.nextInt();
        if (selectedNumber > 0) {
            System.out.println("Number is positive!");
        } else {
            System.out.println("Number is negative!");
        }

    }


}
