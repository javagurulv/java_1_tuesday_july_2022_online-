package student_andrei_kholiavskii.lesson_2_variables.level_2_intern.task_8;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class UserName {
    public static void main(String[] args){

        Scanner userScanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String userName = userScanner.nextLine(); // get users name
        System.out.println("Hello " + userName + "!");
    }
}
