package student_roman_hytt.lesson_5.level_4.task_27;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        Random randomNumber = new Random();
        int arrayLength = randomNumber.nextInt(20);
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomNumber.nextInt(20);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int maxNumber = 0;
        for (int i = 0; i < numbers.length; i++){

            if (numbers[i]>maxNumber) {
                maxNumber = numbers[i];
                System.out.println("Max number:" + maxNumber);

            }
        }

    }}
