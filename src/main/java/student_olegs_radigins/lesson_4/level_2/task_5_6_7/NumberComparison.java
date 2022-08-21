package student_olegs_radigins.lesson_4.level_2.task_5_6_7;

import java.util.Scanner;

class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter a second number: ");
        int secondNumber = scanner.nextInt();

        if(firstNumber == secondNumber){
            System.out.println("The numbers are equals.");
        }else {
            System.out.println("Numbers are different.");

            if(firstNumber > secondNumber){
                System.out.println("The first number is greater.");
            }else {
                System.out.println("The second number is greater.");
            }
            if(firstNumber < secondNumber){
                System.out.println("The first number is less.");
            }else {
                System.out.println("The second number is less.");
            }

        }


    }
}
