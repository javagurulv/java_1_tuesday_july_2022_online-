package student_eduard_minajev.lesson_5_arrays_for_loop.homework.level_2_intern;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task14 {

    public static void main (String[] args){

        int [] randomArray = new int [10];
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = random.nextInt(100);
        }

        int sum = 0;
        for (int i =0; i < randomArray.length; i++){
            sum += sum + randomArray[i];
        }
        System.out.println("The sum is " + sum);

        double average = sum / randomArray.length;
        System.out.println("The average is " + average);





    }

}
