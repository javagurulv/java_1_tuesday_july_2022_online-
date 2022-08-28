package student_ernest_aleskevics.lesson_4.level_3.task_10;

import java.util.Scanner;

public class TheHighestNumber {

    public static void main(String[] args) {

        Scanner inPut = new Scanner(System.in);

        System.out.println("Please enter the fist number: ");
        int numberOne = inPut.nextInt();

        System.out.println("Please enter the second number: ");
        int numberTwo = inPut.nextInt();

        System.out.println("Please enter the second number: ");
        int numberThree = inPut.nextInt();

        if (numberOne > numberTwo && numberOne > numberThree){
            System.out.println("The highest number is " + numberOne);
        } else if (numberTwo > numberOne && numberTwo > numberThree){
            System.out.println("The highest number is " + numberTwo);
        } else if (numberThree > numberOne && numberThree > numberOne){
            System.out.println("The highest number is " + numberThree);
        }
    }
}
