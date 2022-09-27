package student_jelena_voinica.lesson_4;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner scanner = new Scanner(System.in);

        double num = scanner.nextDouble();

        if ((num % 2 ) == 0){

            System.out.println("even");}

        else{
            System.out.println("odd");}


        }
    }