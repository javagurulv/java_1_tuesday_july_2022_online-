package student_eduard_minajev.lesson_4_if_statement.level_4_junior;

import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args){
        System.out.println("This is calculator application!");
        System.out.println("It functions according to model: A (action) B = Result");

        System.out.println("Please enter number for operand A!");
        Scanner scan = new Scanner(System.in);
        int operandA = scan.nextInt();

        System.out.println("Please enter number for operand B!");
        int operandB = scan.nextInt();

        System.out.println("Please choose action from available list:");
        System.out.println("PLUS; MINUS; MULTIPLY; DIVIDE");
        Scanner scannAction = new Scanner(System.in);
        String operandValue = scannAction.nextLine();
        
        // К сожалению, не смог заставить работать выражение if (operandValue == +). Пришлось восспользоваться костылем.

        if (operandValue == "PLUS"){
            Calculator calculator = new Calculator();
            int result = calculator.sum(operandA,operandB);
            System.out.println("Result is:" + result);
            
        } else if (operandValue == "MINUS") {
            Calculator calculator = new Calculator();
            int result = calculator.dif(operandA,operandB);
            System.out.println("Result is:" + result);
            
        } else if (operandValue == "MULTIPLY") {
            Calculator calculator = new Calculator();
            int result = calculator.mult(operandA,operandB);
            System.out.println("Result is:" + result);
            
        } else if (operandValue == "DIVIDE") {
            Calculator calculator = new Calculator();
            int result = calculator.divid(operandA,operandB);
            System.out.println("Result is:" + result);
        }


    }

}
