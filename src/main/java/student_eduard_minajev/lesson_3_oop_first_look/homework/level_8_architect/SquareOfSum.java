package student_eduard_minajev.lesson_3_oop_first_look.homework.level_8_architect;

import java.lang.Math;

class SquareOfSum {

    double operandA;

    double operandB;

    double result;

    SquareOfSum (double operandA, double operandB){
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
        return this.result=((Math.pow(operandA, 2)) + 2*(operandA * operandB)+(Math.pow(operandB, 2)));

    }

    void provideExplanation () {
        System.out.println("The result formula is:(" + operandA + " + " + operandB + ")^2 = " + operandA + "^2 + 2*(" + operandA + " * " + operandB + ") + " + operandB +"^2 =" + result);

    }





}
