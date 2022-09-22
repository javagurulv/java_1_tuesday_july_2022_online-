package student_ivan_mostepanov.lesson_5_arrays_for_loop.level_2_intern;

import java.util.Random;

class Task13 {

    public static void main(String[] args){

        int[] numbers = new int[10];
        Random randomGenerator = new Random();
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = randomGenerator.nextInt(100);
            System.out.println(numbers[j]);
        }

        int sum = 0;
        for (int j = 0; j < numbers.length ; j ++) {
            sum = sum + numbers[j];


        }
        System.out.println("The sum is " + sum);

    }





}
