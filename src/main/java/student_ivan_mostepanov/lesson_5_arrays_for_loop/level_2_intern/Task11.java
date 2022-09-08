package student_ivan_mostepanov.lesson_5_arrays_for_loop.level_2_intern;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task11 {

    public static void main(String[] args){

        int[] numbers = new int[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers");


            for (int j = 0; j < numbers.length; j++) {
                numbers[j] = scanner.nextInt();

            }

        System.out.println("Your numbers are:");

        /*for (int number : numbers)*/

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[ i ]);

        }

        }

}
