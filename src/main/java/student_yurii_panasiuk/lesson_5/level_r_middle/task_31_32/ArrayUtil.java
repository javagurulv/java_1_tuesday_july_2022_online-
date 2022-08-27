package student_yurii_panasiuk.lesson_5.level_r_middle.task_31_32;

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


    }


