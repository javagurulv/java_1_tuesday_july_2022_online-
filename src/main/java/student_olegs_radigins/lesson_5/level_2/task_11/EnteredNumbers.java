package student_olegs_radigins.lesson_5.level_2.task_11;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class EnteredNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number " +(i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
