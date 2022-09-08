package student_ernest_aleskevics.lesson_4.level_2.task_7;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class EqualsOrDifferent {

    public static void main(String[] args) {

        Scanner inPut = new Scanner(System.in);

        System.out.println("Please enter the fist number: ");
        int numberOne = inPut.nextInt();

        System.out.println("Please enter the second number: ");
        int numberTwo = inPut.nextInt();

        if (numberOne == numberTwo) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
