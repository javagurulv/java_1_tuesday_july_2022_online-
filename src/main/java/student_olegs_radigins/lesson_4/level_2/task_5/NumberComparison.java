package student_olegs_radigins.lesson_4.level_2.task_5;

import java.util.Scanner;

class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter a second number: ");
        int secondNumber = scanner.nextInt();
        if(firstNumber > secondNumber){
            System.out.println("The first number is greater.");
        }else if(firstNumber == secondNumber){
            System.out.println("The numbers are equal.");
        }else {
            System.out.println("The second number is greater.");
        }
    }
}
