/*Создайте класс ArrayUtil.
Напишите в этом классе метод для создания
массива целых чисел указанной длины.

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        // Напишите реализацию !!!
    }

} */

package student_eduard_minajev.lesson_5_arrays_for_loop.homework.level_5_middle;

import java.util.Random;
import java.util.Scanner;
public class ArrayUtil {

    /* Task 31 - done */
    public  int[] createArray(int arrayLength){
        int[] newArray = new  int [arrayLength];
        for (int i = 0; i< newArray.length; i++){
            /* System.out.println(newArray[i]); */
        } return newArray;
    }
    /* Task 33 - done */
    public int [] fillArrayWithRandomNumbers (int number){
        int [] randomArray = new int[number];
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = random.nextInt(100);
        } return randomArray;
    }

    /* Task 34  */
    public void printArrayToConsole(int[] array){
        System.out.println(array);
    }

    /* Task 35 */

    public int findMaxNumber(int[] array) {
        int maxValueOfArray = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > maxValueOfArray){
                maxValueOfArray = array[i];
            }
        }return maxValueOfArray;
    }

    /* Task 37 */

    public int findMinNumber(int[] array) {
        int minValueOfArray = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] < minValueOfArray){
                minValueOfArray = array[i];
            }
        }return minValueOfArray;
    }




}
