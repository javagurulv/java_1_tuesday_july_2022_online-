package student_eduard_minajev.lesson_2_variables.homework.level_3_junior;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please Enter Your Name and Surname!");
        String userNameSurname = scanner.nextLine();
        System.out.println("Hello Dear " + userNameSurname);

    }
}
