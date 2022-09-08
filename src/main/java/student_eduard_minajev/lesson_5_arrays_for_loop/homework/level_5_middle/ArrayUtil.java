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

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArrayUtil {

    /* Task 31 - redone */
    public int generateArrayLength () {
        System.out.println("Pleas enter array length");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public  int[] createArray(int arrayLength ) {
        return new int[arrayLength];

    }

    /* Task 33 - redone */

    public void fillArrayWithRandomNumbers(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
    }

    /* Task 34  */
    public void printArrayToConsole(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array);
        }
    }

    /* Task 35 */

    public int findMaxNumber(int[] array) {
        int maxValueOfArray = array [0];
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
