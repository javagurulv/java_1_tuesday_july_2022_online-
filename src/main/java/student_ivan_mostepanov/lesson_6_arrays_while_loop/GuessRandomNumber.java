package student_ivan_mostepanov.lesson_6_arrays_while_loop;

import java.util.Random;
import java.util.Scanner;

class GuessRandomNumber {

    public static void main(String[] args) {

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(100);
        {
            System.out.println("Random number: " + randomNumber);

            Scanner scaner = new Scanner(System.in);

            System.out.println("Enter number");
            int quessedNumber = scaner.nextInt();

            while (quessedNumber != randomNumber) {
                System.out.println("Wrong! Enter new number");
                quessedNumber = scaner.nextInt();


            }
            System.out.println("You WIN! NUMBER = " + quessedNumber);
        }


    }
}