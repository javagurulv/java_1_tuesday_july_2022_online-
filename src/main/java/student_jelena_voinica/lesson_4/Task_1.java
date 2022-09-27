package student_jelena_voinica.lesson_4;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task_1 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        int input = in.nextInt();
        if(input>0){
            System.out.println("Positive");
        }
        else if (input<0){
        }
        System.out.println("Negative");
    }
}
