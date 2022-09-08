package student_olegs_radigins.lesson_5.level_4.task_25;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class EnteredNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the length of the array: ");
        int arrayLength = scanner.nextInt();

        int[] numbers = new int[arrayLength];
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter number " +(i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
