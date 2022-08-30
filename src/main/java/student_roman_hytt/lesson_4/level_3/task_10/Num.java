package student_roman_hytt.lesson_4.level_3.task_10;

import java.util.Scanner;

public class Num {
public static void main (String[]args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please write first number");
    int firstNumber = scanner.nextInt();
    System.out.println("Please write second number");
    int secondNumber = scanner.nextInt();
    System.out.println("Please write third number");
    int thirdNumber = scanner.nextInt();

    if (firstNumber > secondNumber && firstNumber > thirdNumber) {
        System.out.println(firstNumber + " is lager");
    }

    else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
        System.out.println(secondNumber + " is lager");

    }
else if (thirdNumber>firstNumber && thirdNumber>secondNumber)System.out.println(thirdNumber + " is lager");


 if (firstNumber==secondNumber&& firstNumber==thirdNumber && secondNumber==thirdNumber) System.out.println("All numbers are equal");
}


}

