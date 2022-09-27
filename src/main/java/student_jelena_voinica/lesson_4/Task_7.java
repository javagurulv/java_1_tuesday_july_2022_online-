package student_jelena_voinica.lesson_4;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task_7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two number");
        int i = sc.nextInt();
        int j = sc.nextInt();

        if (i==j){
            System.out.println("Number are equals:");
        }
        else
            if(i!=j){
                System.out.println("Number are different:");
            }
    }
}
