package student_eduard_minajev.lesson_3_oop_first_look.homework.level_8_architect;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class MultiplicationApplication {

    public static void main(String[] args){

        System.out.println("Please choose the formula you want to lear!");
        System.out.println("Square of Sum: (a+b)^2 - [1]");
        System.out.println("Square of Difference: (a-b)^2 - [2]");
        System.out.println("Cube of Sum: (a+b)^3 - [3]");
        System.out.println("Cube of Difference: (a-b)^3 - [4]");
        System.out.println("Difference of Squares: (a^2)-(b^2) - [5]");
        System.out.println("Sum of Cubes: (a^3)+(b^3) -[6]");
        System.out.println("Difference of Cubes: (a^3) - (b^3) - [7]");

        System.out.println("Please enter the number of formula you want to learn!");
        Scanner formulaScanner = new Scanner(System.in);
        int formulaSelection = formulaScanner.nextInt();
        if (formulaSelection == 1) {
            SquareOfSum squareSum = new SquareOfSum(0, 0);

            System.out.println("Now, please provide operand a!");
            Scanner operandA = new Scanner(System.in);
            int valueOperandA = operandA.nextInt();
            System.out.println("Now please provide operand b!");
            Scanner operandB = new Scanner(System.in);
            int valueOperandB = operandB.nextInt();
            squareSum.changeOperandA(valueOperandA);
            squareSum.changeOperandB(valueOperandB);
            squareSum.calculateResult();
            squareSum.provideExplanation();

        }
        if (formulaSelection == 2) {
            SquareOfDifference squareDiff = new SquareOfDifference(0,0);

            System.out.println("Now, please provide operand a!");
            Scanner operandA = new Scanner(System.in);
            int valueOperandA = operandA.nextInt();
            System.out.println("Now please provide operand b!");
            Scanner operandB = new Scanner(System.in);
            int valueOperandB = operandB.nextInt();
            squareDiff.changeOperandA(valueOperandA);
            squareDiff.changeOperandB(valueOperandB);
            squareDiff.calculateResult();
            squareDiff.provideExplanation();

        }
        if (formulaSelection == 3) {
            CubeOfSum cubeOfSum = new CubeOfSum(0,0);

            System.out.println("Now, please provide operand a!");
            Scanner operandA = new Scanner(System.in);
            int valueOperandA = operandA.nextInt();
            System.out.println("Now please provide operand b!");
            Scanner operandB = new Scanner(System.in);
            int valueOperandB = operandB.nextInt();
            cubeOfSum.changeOperandA(valueOperandA);
            cubeOfSum.changeOperandB(valueOperandB);
            cubeOfSum.calculateResult();
            cubeOfSum.provideExplanation();

        }
        if (formulaSelection == 4){
            CubeOfDifference cubeDiffer = new CubeOfDifference(0,0);

            System.out.println("Now, please provide operand a!");
            Scanner operandA = new Scanner(System.in);
            int valueOperandA = operandA.nextInt();
            System.out.println("Now please provide operand b!");
            Scanner operandB = new Scanner(System.in);
            int valueOperandB = operandB.nextInt();
            cubeDiffer.changeOperandA(valueOperandA);
            cubeDiffer.changeOperandB(valueOperandB);
            cubeDiffer.calculateResult();
            cubeDiffer.provideExplanation();

        }
        if (formulaSelection == 5) {
            DifferenceOfSquares differenceOfSquares = new DifferenceOfSquares(0,0);

            System.out.println("Now, please provide operand a!");
            Scanner operandA = new Scanner(System.in);
            int valueOperandA = operandA.nextInt();
            System.out.println("Now please provide operand b!");
            Scanner operandB = new Scanner(System.in);
            int valueOperandB = operandB.nextInt();
            differenceOfSquares.changeOperandA(valueOperandA);
            differenceOfSquares.changeOperandB(valueOperandB);
            differenceOfSquares.calculateResult();
            differenceOfSquares.provideExplanation();

        }
        if (formulaSelection == 6) {
            SumOfCubes sumOfCubes = new SumOfCubes(0,0);

            System.out.println("Now, please provide operand a!");
            Scanner operandA = new Scanner(System.in);
            int valueOperandA = operandA.nextInt();
            System.out.println("Now please provide operand b!");
            Scanner operandB = new Scanner(System.in);
            int valueOperandB = operandB.nextInt();
            sumOfCubes.changeOperandA(valueOperandA);
            sumOfCubes.changeOperandB(valueOperandB);
            sumOfCubes.calculateResult();
            sumOfCubes.provideExplanation();

        }
        if (formulaSelection == 7) {
            DifferenceOfCubes differenceOfCubes = new DifferenceOfCubes(0,0);

            System.out.println("Now, please provide operand a!");
            Scanner operandA = new Scanner(System.in);
            int valueOperandA = operandA.nextInt();
            System.out.println("Now please provide operand b!");
            Scanner operandB = new Scanner(System.in);
            int valueOperandB = operandB.nextInt();
            differenceOfCubes.changeOperandA(valueOperandA);
            differenceOfCubes.changeOperandB(valueOperandB);
            differenceOfCubes.calculateResult();
            differenceOfCubes.provideExplanation();

        }




    }




}
