package student_ernest_aleskevics.lesson_4.level_1.task_4;

import java.util.Scanner;

public class EvenOrNotEven {
    public static void main(String[] args) {

        Scanner inPut = new Scanner (System.in);
        System.out.println("Please enter integer number: ");
        int number = inPut.nextInt();

        if (number % 2 == 0){
            System.out.println("The number is even!");
        } else {
            System.out.println("The number is not even!");
        }

    }
}
