package student_yurii_panasiuk.lesson_5.level_5_6.task_31_32;

import java.util.Arrays;

class ArrayUtil {

     static int [] createArray(int arrayLength) {
          return new int [arrayLength];
    }

    static void fillArrayWithRandomNumbers(int[] array) {
        int randomUpperLevel =10;
        int randomLoverLevel =1;

        for (int i = 0; i < array.length; i++) {
            array[i]=(int) (randomLoverLevel+Math.random() * randomUpperLevel);
        }
    }

    static void printArrayToConsole(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    int findMaxNumber(int[] array) {
        int [] sortArray = array;
         Arrays.sort(sortArray);
        return sortArray[sortArray.length-1];
    }

    }


