package student_eduard_minajev.lesson_5_arrays_for_loop.homework.level_4_junior;

import java.util.Random;
import java.util.Scanner;

public class Task26 {

    public static void main(String[] args) {
        int arrayLength = requestArrayLength();
        int [] newArray = fillArrayRandomNumbers(arrayLength);
    }

    public static int requestArrayLength (){
        System.out.println("Please enter array length");
        Scanner userArrayLength = new Scanner(System.in);
        int arrayLength = userArrayLength.nextInt();
        return arrayLength;
    }

    public static int [] fillArrayRandomNumbers (int number){
        int [] randomArray = new int[number];
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = random.nextInt(100);
            System.out.println(randomArray[i]);
        } return randomArray;
    }


}