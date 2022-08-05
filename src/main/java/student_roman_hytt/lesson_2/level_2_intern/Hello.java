package student_roman_hytt.lesson_2.level_2_intern;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Hello {
    public static void main(String[] args) {
        System.out.println( "What is Your name?");
        Scanner a = new Scanner(System.in);
        String b = a.nextLine();
System.out.println( "Hello " + b);
    }
}