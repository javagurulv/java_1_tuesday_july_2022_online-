package student_ernest_aleskevics.lesson_4.level_3.task_8;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ThreeNumbers {
    public static void main(String[] args) {

        Scanner inPut = new Scanner(System.in);

        System.out.println("Please enter the fist number: ");
        int numberOne = inPut.nextInt();

        System.out.println("Please enter the second number: ");
        int numberTwo = inPut.nextInt();

        System.out.println("Please enter the second number: ");
        int numberThree = inPut.nextInt();

        if (numberOne == numberTwo && numberOne == numberThree && numberTwo == numberThree){
            System.out.println("All numbers are equal");
        } else if (numberOne != numberTwo && numberOne != numberThree && numberTwo != numberThree){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }


}
