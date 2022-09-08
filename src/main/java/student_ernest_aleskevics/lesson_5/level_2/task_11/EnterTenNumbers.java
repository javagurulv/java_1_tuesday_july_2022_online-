package student_ernest_aleskevics.lesson_5.level_2.task_11;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class EnterTenNumbers {

    public static void main(String[] args) {

        Scanner inPut = new Scanner (System.in);
        int[] numbers = new int [10];

        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < 10; i++){
            numbers[i] = inPut.nextInt();
        }
        System.out.println("Your numbers are: ");
        for (int i = 0; i < 10; i++){
           System.out.print(numbers[i] + " ");
        }
    }

}
