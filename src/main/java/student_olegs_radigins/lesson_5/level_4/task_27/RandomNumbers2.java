package student_olegs_radigins.lesson_5.level_4.task_27;

import java.util.Random;

class RandomNumbers2 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int arrayLength = randomGenerator.nextInt(50);
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomGenerator.nextInt(50);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int maxNumber = 0;
        for (int i = 0;i < numbers.length; i++){
            if( numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
        }
        System.out.println("Max number is: " + maxNumber);
    }
}
