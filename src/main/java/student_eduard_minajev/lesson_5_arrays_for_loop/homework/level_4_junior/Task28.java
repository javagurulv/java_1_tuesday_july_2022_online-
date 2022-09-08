package student_eduard_minajev.lesson_5_arrays_for_loop.homework.level_4_junior;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task28 {
// исправлено по аналогии с другими заданиями
    public static void main(String[] args){

        int sizeOfArray = generateArrayLength();
        int [] newArray = createNewArray(sizeOfArray);
        printArrayToConsole(newArray);
        findMinValue(newArray);

    }

	public static int generateArrayLength () {
        Random randomLength = new Random();
        return randomLength.nextInt(10);

    }
    public static int [] createNewArray(int arrayLength ) {
        return new int [arrayLength];
    }

    public static int [] fillArrayWithRandomNumbers ( int [] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        } return array;
    }

    public static void printArrayToConsole (int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void findMinValue (int [] number) {
        int minNumber = number[0];
        for (int i = 0; i < number.length; i++){
            if (number[i] < minNumber ){
                minNumber = number[i];
            }
        } System.out.println("The minimal value is " + minNumber);
    }

}
