package student_ernest_aleskevics.lesson_5.level_2.task_13_till_15;

import java.util.Random;

public class RandomNumberSum {

    public static void main(String[] args) {
        int [] randomNumbers = generateRandomNumbers(10);
        printNumbersToConsole(randomNumbers);
        int sumRandomNumbers = calculateRandomNumbers(randomNumbers);
        System.out.println(sumRandomNumbers);
        double avarageRandomNumbers = calculateAvarageRandomNumbers(sumRandomNumbers,randomNumbers);
        System.out.println(avarageRandomNumbers);

    }

    private static int[] generateRandomNumbers(int randomNumberCount) {
        int[] randomNumbers = new int[randomNumberCount];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            int newRandomNumber = random.nextInt(10);
            randomNumbers[i] = newRandomNumber;
        }
        return randomNumbers;
    }
    private static int calculateRandomNumbers (int[] randomNumbers) {
        int sumRandomNumbers = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            sumRandomNumbers = sumRandomNumbers + randomNumbers[i];
        }
        return sumRandomNumbers;
    }
    private static void printNumbersToConsole (int[] randomNumbers) {
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i]);
        }
    }
    private static double calculateAvarageRandomNumbers (int sumRandomNumbers,int randomNumbers[]) {
        return ((double) sumRandomNumbers / randomNumbers.length);
    }

}





