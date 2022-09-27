package student_jelena_voinica.lesson_4;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task_8 {
    public static void main(String[]args){
        System.out.println("Input there number:");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1==num2 && num2==num3 )
        {
            System.out.println("Number are equals:");
        }
        else if (num1!=num2 && num2!=num3 && num1!=num3){
            System.out.println("Number are different:");}

        else{
            System.out.println("Neither all are equals or different:");

                }
    }
        }





