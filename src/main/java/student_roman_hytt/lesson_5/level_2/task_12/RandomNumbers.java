package student_roman_hytt.lesson_5.level_2.task_12;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RandomNumbers {
public static void main (String[]args){
    Random random=new Random();
    int [] randomNumber=new int[10];


    for (int i = 0; i < randomNumber.length; i++) {
        randomNumber[i] = random.nextInt();
    }
    for (int i = 0; i < randomNumber.length; i++) {
        System.out.println(randomNumber [i]);

    }




    }



}
