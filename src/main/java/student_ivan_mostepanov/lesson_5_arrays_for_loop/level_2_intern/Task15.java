package student_ivan_mostepanov.lesson_5_arrays_for_loop.level_2_intern;

import java.util.Random;

class Task15 {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        Random randomGenerator = new Random();
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = randomGenerator.nextInt(100);
        }
        int term = 2;
        int numbersPlus;
        for (int j = 0; j < numbers.length; j++) {
            numbersPlus = numbers[j] + term;

            System.out.println( numbers[j] + "    " +  numbersPlus);


        }
    }
}
