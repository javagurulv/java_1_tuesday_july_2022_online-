package student_ivan_mostepanov.lesson_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
    public class Task8 {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello! What is your name?: ");
            String myName = scanner.nextLine();



            System.out.println(" Hello " + myName);

        }
    }
