package student_eduard_minajev.lesson_2_variables.homework.level_1_intern;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task1 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in); //запускаем сканер
        System.out.println("Please Enter First Whole Number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please Enter Second Whole Number");
        int secondNumber = scanner.nextInt();
        System.out.println("Addition");
        int result = firstNumber + secondNumber;
        System.out.println(result);
        System.out.println("Subtraction");
        int resultsub = firstNumber - secondNumber;
        System.out.println(resultsub);
        System.out.println("Multiplying");
        int resultMul = firstNumber * secondNumber;
        System.out.println(resultMul);
        System.out.println("Divide");
        int resultDiv = firstNumber / secondNumber;
        System.out.println(resultDiv);



    }

}
