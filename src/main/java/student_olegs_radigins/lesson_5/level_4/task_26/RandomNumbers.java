package student_olegs_radigins.lesson_5.level_4.task_26;

import java.util.Random;
import java.util.Scanner;

class RandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the length of the array: ");
        int arrayLength = scanner.nextInt();

        int[] numbers = new int[arrayLength];
        Random randomGenerator = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomGenerator.nextInt(50);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
