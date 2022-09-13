package student_roman_hytt.lesson_5.level_2.task_13;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RandomNumbersSum {
    public static void main (String[]args) {
        Random random = new Random();
        int[] randomNumber = new int[10];


        for (int i = 0; i < randomNumber.length; i++) {
            randomNumber[i] = random.nextInt();
        }

        double sum=0;
        for (int i = 0; i < randomNumber.length; i++) {
            System.out.println(randomNumber [i]);

             sum=sum+randomNumber[i];

System.out.println("Random numbers sum is: " +sum);
        }


}}