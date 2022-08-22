package student_eduard_minajev.lesson_3_oop_first_look.homework.level_8_architect;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DifferenceOfSquares {

    double operandA;

    double operandB;

    double result;

    DifferenceOfSquares (double operandA, double operandB){
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
        return this.result=(operandA - operandB) * (operandA + operandB);

    }

    void provideExplanation () {
        System.out.println("The result formula is:(" + operandA + " - " + operandB + ") * (" + operandA + " + " + operandB + ") =" + result);

    }


}
