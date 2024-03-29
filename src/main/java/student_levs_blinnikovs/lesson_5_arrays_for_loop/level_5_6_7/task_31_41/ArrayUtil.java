package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_5_6_7.task_31_41;

/*
Создайте класс ArrayUtil.
Напишите в этом классе метод для создания
массива целых чисел указанной длины.
 */

import java.util.Random;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public int[] createRandomLengthArray() {
        System.out.println("System will create random (from 1 up to 10) length array: ");
        Random random = new Random();
        int arrayLength = random.nextInt(9) + 1;
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
        System.out.println("Even numbers: ");
        for (int number : array) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    public void findOddNumbers(int[] array) {
        System.out.println("Odd numbers: ");
        for (int number : array) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

    public int findElementSum(int[] array) {
        int elementSum = 0;
        for (int element : array) {
            elementSum += element;
        }
        return elementSum;
    }

    public int findElementAvg(int[] array) {
        return findElementSum(array) / array.length;
    }

    public int[] incrementEachElementBy(int[] array, int increment) {
        int[] incrementedNumbers = createArray(array.length);
        for (int i = 0; i < incrementedNumbers.length; i++) {
            incrementedNumbers[i] = array[i] + increment;
        }
        return incrementedNumbers;
    }

}
