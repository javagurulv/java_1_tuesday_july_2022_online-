package student_olegs_radigins.lesson_3.level2.Task_9;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = scanner.next();
        System.out.println("Hello " + userName + "!");
    }
}
