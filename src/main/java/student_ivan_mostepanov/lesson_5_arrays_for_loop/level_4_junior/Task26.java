package student_ivan_mostepanov.lesson_5_arrays_for_loop.level_4_junior;

import java.util.Random;
import java.util.Scanner;

class Task26 {

    public static void main(String[] args){
        int[] array = createArray();
        fillArrayWithRandomNumbers(array);
        printArrayToConsole(array);
    }
    public static int[] createArray (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length  ");
        int arrayLength = scanner.nextInt();
        return new int[arrayLength];
    }

    public static void fillArrayWithRandomNumbers(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
    }
    public static void printArrayToConsole(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }






}

