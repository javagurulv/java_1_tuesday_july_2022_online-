package student_eduard_minajev.lesson_5_arrays_for_loop.homework.level_4_junior;

import java.util.Random;


public class Task27 {

    public static void main(String[] args){

        int sizeOfArray = generateArrayLength();
        int [] newArray = fillArrayRandomNumbers(sizeOfArray);
        findMaxValue(newArray);

    }
    public static int generateArrayLength () {
        Random randomLength = new Random();
        int arrayLength = randomLength.nextInt(10);
        return arrayLength;
    }

    public static int [] fillArrayRandomNumbers (int number){
        int [] randomArray = new int[number];
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = random.nextInt(1000);
            System.out.println(randomArray[i]);
        } return randomArray;
    }

    public static void findMaxValue (int [] number) {
        int maxNumber = 0;
        for (int i = 0; i < number.length; i++){
            if (number[i] > maxNumber){
                maxNumber = number[i];
            }
        } System.out.println("The max value is " + maxNumber);
    }

}
