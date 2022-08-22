package student_artjom_vakhromeev.lesson_3.task_9;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class UserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();

        System.out.println("Hello " + name + "!");
    }
}
