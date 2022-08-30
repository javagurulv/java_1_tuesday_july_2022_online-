package student_ivan_mostepanov.lesson_4_if_statement.level_4_junior;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

        // реализуйте этот метод:
        // return true - если число чётное (делится на 2 без остатка)
        // иначе return false

}
