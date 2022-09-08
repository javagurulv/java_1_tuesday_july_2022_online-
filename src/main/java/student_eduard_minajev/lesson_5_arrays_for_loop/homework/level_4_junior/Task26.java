package student_eduard_minajev.lesson_5_arrays_for_loop.homework.level_4_junior;


import java.util.Random;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task26 {
// Все переделал
    public static void main(String[] args) {

        int userArrayLength = requestArrayLength();
        int [] newUserArray = createNewArray(userArrayLength);
        fillArrayRandomNumbers(newUserArray);
        printArrayToConsole(newUserArray);
    }
    // упростил
    public static int requestArrayLength() {
        System.out.println("Please enter array length");
        Scanner userArrayLength = new Scanner(System.in);
        return userArrayLength.nextInt();
    }
    // Новый метод
    public static int [] createNewArray(int arrayLength ) {
        return new int [arrayLength];
    }
    // переработал метод
     public static int [] fillArrayRandomNumbers (int [] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        } return array;
    }

    // Новый объект создан
    public static void printArrayToConsole (int [] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

}
