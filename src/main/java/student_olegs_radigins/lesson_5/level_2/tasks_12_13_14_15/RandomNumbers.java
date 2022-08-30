package student_olegs_radigins.lesson_5.level_2.tasks_12_13_14_15;

import java.util.Random;

class RandomNumbers {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int [] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomGenerator.nextInt(50);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum is " + sum);

       double averageNumber = sum / numbers.length;
        System.out.println("Average number is: " + averageNumber);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 2;
            System.out.println(numbers[i]);
        }
    }
}
