package student_andrei_kholiavskii.lesson_2_variables.task_8;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args){

        Scanner userScanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String userName = userScanner.nextLine(); // get users name
        System.out.println("Hello " + userName + "!");
    }
}
