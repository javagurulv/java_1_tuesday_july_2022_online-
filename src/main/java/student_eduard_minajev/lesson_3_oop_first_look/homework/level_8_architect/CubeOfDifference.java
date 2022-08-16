package student_eduard_minajev.lesson_3_oop_first_look.homework.level_8_architect;

import java.lang.Math;

public class CubeOfDifference {

    double operandA;

    double operandB;

    double result;

    CubeOfDifference (double operandA, double operandB){
        this.operandA=operandA;
        this.operandB=operandB;

    }

    void changeOperandA (double newOperandA){
        this.operandA=newOperandA;
    }

    void changeOperandB (double newOperandB){
        this.operandB=newOperandB;
    }

    double calculateResult (){
        return this.result=((Math.pow(operandA, 3)) - 3*((Math.pow(operandA, 2)) * operandB) + 3*((Math.pow(operandB, 2)) * operandA) - ((Math.pow(operandB, 3))));

    }

    void provideExplanation () {
        System.out.println("The result formula is:(" + operandA + " - " + operandB + ")^3 = " + operandA + "^3 - 3*(" + operandA + "^2 * " + operandB + ") + 3*(" + operandB + " ^2 * + " + operandA + ") - " + operandB +"^3 =" + result);

    }
}
