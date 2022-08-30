package student_ivan_mostepanov.lesson_2.level_3_junior;

import java.util.Scanner;

class Task11 {

    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        double numberOne = scanner.nextInt();
        System.out.println("Enter Second number");
        double numberTwo = scanner.nextInt();
        System.out.println("Enter Third number");
        double numberThree = scanner.nextInt();


    double averageNumber = (numberOne + numberTwo + numberThree) / 3;

    System.out.println("Average number of "+ numberOne +" ; " + numberTwo + " ; " + numberThree + " = " + averageNumber);




    }





}
