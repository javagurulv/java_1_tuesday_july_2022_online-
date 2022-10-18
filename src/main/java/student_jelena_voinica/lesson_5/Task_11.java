package student_jelena_voinica.lesson_5;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task_11 {
    public static void main(String[]args){
        System.out.println("Input number");
        Scanner scanner = new Scanner(System.in);

        int[]nums = new int[10];

        for(int i=0;i<10;i++){
            nums[i] = i;

        }
        for (int i=0;i<10;i++){
            System.out.println("String [" + i +"]");
        }
    }

}
