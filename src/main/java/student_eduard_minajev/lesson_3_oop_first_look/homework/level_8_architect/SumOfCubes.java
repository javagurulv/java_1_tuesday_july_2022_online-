package student_eduard_minajev.lesson_3_oop_first_look.homework.level_8_architect;

import java.lang.Math;

public class SumOfCubes {

    double operandA;

    double operandB;

    double result;

    SumOfCubes (double operandA, double operandB){
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
        return this.result=(operandA + operandB) * ((Math.pow(operandA, 2)) - (operandA*operandB) + (Math.pow(operandB, 2))) ;

    }

    void provideExplanation () {
        System.out.println("The result formula is:(" + operandA + " + " + operandB + ") * (" + operandA + "^2 - " + operandA + " * " + operandB + " + " + operandB + "^2) =" + result);

    }

}
