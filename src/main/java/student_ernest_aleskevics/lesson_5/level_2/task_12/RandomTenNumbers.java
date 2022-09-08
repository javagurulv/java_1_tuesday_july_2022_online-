package student_ernest_aleskevics.lesson_5.level_2.task_12;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RandomTenNumbers {

    public static void main(String[] args) {
        int[] randomNumbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++ ){
            int newRandomNumber = random.nextInt();
            randomNumbers[i] = newRandomNumber;
            System.out.println("Random numbers is: " + randomNumbers[i]);
        }
    }
}
