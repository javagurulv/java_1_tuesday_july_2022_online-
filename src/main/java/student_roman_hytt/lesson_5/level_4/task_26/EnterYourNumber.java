package student_roman_hytt.lesson_5.level_4.task_26;

import java.util.Random;
import java.util.Scanner;

public class EnterYourNumber {

    public static void main (String[]args){
        System.out.println("Write your array length");
        Scanner scanner=new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int [] number=new int[arrayLength];
        Random random=new Random();
        for (int i=0;i< arrayLength;i++) {
             number[i]=random.nextInt(20);}

            for (int i=0;i< arrayLength;i++)

            System.out.println(number[i]);

        }

    }








