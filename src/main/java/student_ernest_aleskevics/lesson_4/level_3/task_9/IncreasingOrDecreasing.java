package student_ernest_aleskevics.lesson_4.level_3.task_9;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class IncreasingOrDecreasing {

    public static void main(String[] args) {

        Scanner inPut = new Scanner(System.in);

        System.out.println("Please enter the fist number: ");
        int numberOne = inPut.nextInt();

        System.out.println("Please enter the second number: ");
        int numberTwo = inPut.nextInt();

        System.out.println("Please enter the second number: ");
        int numberThree = inPut.nextInt();

        if (numberOne > numberTwo && numberOne > numberThree && numberTwo > numberThree){
            System.out.println("Decreasing");
        } else if (numberThree > numberTwo && numberThree> numberOne && numberTwo > numberOne){
            System.out.println("Increasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
