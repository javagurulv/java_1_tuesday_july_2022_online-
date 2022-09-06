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
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Лишний импорт Scanner")
public class ArrayUtil {

    /* Task 31 - done */
	@CodeReviewComment(teacher = "Зачем тут цикл?")
    public  int[] createArray(int arrayLength){
        int[] newArray = new  int [arrayLength];
        for (int i = 0; i< newArray.length; i++){
            /* System.out.println(newArray[i]); */
        } return newArray;
    }

    /* Task 33 - done */
	@CodeReviewComment(teacher = "Этот метод делает две вещи создаёт массив и заполняет его случайными числами."
			+ "Подбери долее правильное название методу.")
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
	@CodeReviewComment(teacher = "Тут ошибка в логике!")
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
