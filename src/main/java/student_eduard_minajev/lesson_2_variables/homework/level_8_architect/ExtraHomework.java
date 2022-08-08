package student_eduard_minajev.lesson_2_variables.homework.level_8_architect;
import java.util.Scanner;
import static java.lang.Math.*;
public class ExtraHomework {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's learn Short Multiplication Formulas! ");
        System.out.println("Please enter the value of variable A! ");
        int operandA = scanner.nextInt();
        System.out.println("Please enter the value of variable B! ");
        int operandB = scanner.nextInt();
        System.out.println("Please see Short Multiplication Formulas and their number!:");
        System.out.println("Square of Sum - 1;");
        System.out.println("Square of Difference - 2;");
        System.out.println("Cube of Sum - 3;");
        System.out.println("Cube of Difference - 4;");
        System.out.println("Difference of Squares - 5;");
        System.out.println("Sum of Cubes - 6;");
        System.out.println("Difference of Cubes - 7.");
        System.out.println("Please enter the number of formula you want to calculate! "); //only 1st is working at the moment.
        long squareOfSumOne = (long) pow(operandA, 2);
        long squareOfSumTwo = (long) pow(operandB, 2);
        long squareOfSumThree = (long) operandA * operandB;
        long squareOfSumFour = (long) squareOfSumThree * 2;
        long squareOfSumFive = (long) squareOfSumOne + squareOfSumTwo + squareOfSumFour;
        long result = squareOfSumFive;
        String cubeOfSum = "Cube of Sum";
        String cubeOfDifference = "Cube of Difference";
        String differenceOfSquares = "Difference of Squares";
        String sumOfCubes = "Sum of Cubes";
        String differenceOfCubes = "Difference of Cubes";
        Scanner userSelect = new Scanner(System.in);
        int formulaArgument = userSelect.nextInt();
        if ( formulaArgument == 1){
            System.out.println("The formula is (a − b)^2 = a^2 − 2ab + b^2 and after calculation the result is = " +  result );
        }




    }
}
