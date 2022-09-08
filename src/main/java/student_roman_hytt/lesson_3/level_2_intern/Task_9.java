package student_roman_hytt.lesson_3.level_2_intern;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task_9 {

    public static void main (String [] args) {

       System.out.println ("what is your name?");
        Scanner a= new Scanner (System.in);
        String userName = a.next();
        System.out.println("Hello "+ userName+ "!");
    }
}
