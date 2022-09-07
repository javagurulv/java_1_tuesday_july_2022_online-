package student_eduard_minajev.lesson_5_arrays_for_loop.homework.level_4_junior;

import java.util.Random;



public class Task29 {

    public static void main(String[] args) {

        int sizeOfArray = generateArrayLength();
        int[] newArray = createNewArray(sizeOfArray);
        fillArrayWithRandomNumbers(newArray);
        printEvenNumbers(newArray);


    }

    public static int generateArrayLength() {
        Random randomLength = new Random();
        return randomLength.nextInt(10);

    }

    public static int[] createNewArray(int arrayLength) {
        return new int[arrayLength];
    }

    public static int[] fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static void printEvenNumbers (int [] array){
        for (int i = 0; i< array.length; i++ ){
            if (array[i] % 2 == 0 ) {
                System.out.println("Even numbers are " + array[i]);
            }
        }
    }
}
