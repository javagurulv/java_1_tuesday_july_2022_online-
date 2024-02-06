package student_olegs_radigins.lesson_5.level_5_6.task_31_32_33_34_35;

import java.util.Random;

public class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int[] numbers = new int[arrayLength];
        return numbers;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt();
        }
    }
    public void printArrayToConsole(int[] array) {
        for(int i =0; i < array.length; i++){
            System.out.println("Array[" + i +"] = " + array[i]);
        }
    }
    public int findMaxNumber(int[] array) {
        int maxNumber = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]>maxNumber){
                maxNumber=array[i];
            }
        }
        return maxNumber;
    }

    public int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++){
            if (minNumber >= array[i]){
                minNumber = array[i];
            }
        }
        return minNumber;
    }
}
