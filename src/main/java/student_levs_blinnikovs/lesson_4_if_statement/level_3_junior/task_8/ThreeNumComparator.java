package student_levs_blinnikovs.lesson_4_if_statement.level_3_junior.task_8;

/*
Write a Java program that accepts three numbers and prints:
- "All numbers are equal" if all three numbers are equal,
- "All numbers are different" if all three numbers are different
- "Neither all are equal or different" otherwise.
 */

import teacher.lesson_x.insurance_policy.solutions.v2.businesslogic.TheftRiskCoeficientDetector;

class ThreeNumComparator {

    int firstNumber;
    int secondNumber;
    int thirdNumber;

    ThreeNumComparator(int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    String compareNumbers() {
        if (this.firstNumber == this.secondNumber && this.firstNumber == this.thirdNumber && this.secondNumber == this.thirdNumber) {
            return "All numbers are equal";
        } else if (this.firstNumber != this.secondNumber && this.firstNumber != this.thirdNumber && this.secondNumber != this.thirdNumber ) {
            return "All numbers are different";
        } else return "Neither all are equal or different";
    }

}
