package student_olegs_radigins.lesson_4.level_4.task_11;


class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public int divide (int firstNumber, int secondNumber) {
        if( secondNumber != 0){
            return firstNumber / secondNumber;
        }
        System.out.print("Can't divide by ");
        return secondNumber;
    }
}

