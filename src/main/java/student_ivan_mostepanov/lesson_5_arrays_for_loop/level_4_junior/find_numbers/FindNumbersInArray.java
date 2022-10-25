package student_ivan_mostepanov.lesson_5_arrays_for_loop.level_4_junior.find_numbers;

import java.util.Random;

class FindNumbersInArray {


    public static int createArrayLength (){
        Random randomLength = new Random();
        return randomLength.nextInt(10);
    }

    public static  int[] createNewArray(int arrayLength){
        return new int[arrayLength];
    }

    public static void fillArrayWithRandomNumbers(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
    }
    public static void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void findMaxNumber ( int[] array){
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        System.out.println("Max number is  " + maxNumber);
    }

    public static void findMinNumber ( int[] array){
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        System.out.println("Min number is  " + minNumber);
    }
    public static void findEvenNumber ( int[] array){
                for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Even number is  " + array[i]);
            }

        }

    }
    public static void findOddNumber ( int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("Odd number is  " + array[i]);
            }

        }

    }
}
