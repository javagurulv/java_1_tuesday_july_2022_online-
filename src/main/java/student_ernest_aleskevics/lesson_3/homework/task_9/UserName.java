package student_ernest_aleskevics.lesson_3.homework.task_9;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class UserName {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String userName = name.nextLine();
        System.out.println("Hello " + userName + "!");

    }
}
