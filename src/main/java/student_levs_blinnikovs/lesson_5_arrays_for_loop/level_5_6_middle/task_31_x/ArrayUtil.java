package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_5_6_middle.task_31_x;

/*
Создайте класс ArrayUtil.
Напишите в этом классе метод для создания
массива целых чисел указанной длины.
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Переименуй i в циклах for each в более подходящее название."
		+ "src/main/java/teacher/lesson_5_arrays_for_loop/codereview/CleanCodeWarning_2.txt", student = "Fixed")
public class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public int getArrayLengthWithUserInput() {
        System.out.println("Enter array length: ");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    public void fillArrayWithUserInput(int[] array) {
        System.out.println("Please fill in your desired array. ");
        Scanner userInput = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter next array element: ");
            array[i] = userInput.nextInt();
        }
    }

    public void printArrayToConsole(int[] array) {
        System.out.println("Your array: ");
        for (int arrayElement : array) {
            System.out.println(arrayElement);
        }
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int arrayElement : array) {
            if (maxNumber < arrayElement) {
                maxNumber = arrayElement;
            }
        }
        return maxNumber;
    }

    public int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int arrayElement : array) {
            if (minNumber > arrayElement) {
                minNumber = arrayElement;
            }
        }
        return minNumber;
    }

    public void findEvenNumbers(int[] array) {
        for (int number : array) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    public void findOddNumbers(int[] array) {
        for (int number : array) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

}
