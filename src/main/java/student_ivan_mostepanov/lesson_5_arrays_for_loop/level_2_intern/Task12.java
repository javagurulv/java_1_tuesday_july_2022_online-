package student_ivan_mostepanov.lesson_5_arrays_for_loop.level_2_intern;

import java.util.Random;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task12 {



    public static void main(String[] args){

        Random randomGenerator = new Random();
        int[] numbers = new int[10];
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = randomGenerator.nextInt(100);
            System.out.println(numbers[j]);
        }

        }

    }






