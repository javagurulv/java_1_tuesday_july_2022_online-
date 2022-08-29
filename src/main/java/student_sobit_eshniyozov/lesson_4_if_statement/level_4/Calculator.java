package student_sobit_eshniyozov.lesson_4_if_statement.level_4;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        }
        if (firstNumber < secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }
    public int maxOfThreeNumbersVersion (int firstNumber, int secondNumber, int thirdNumber){
        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            return firstNumber;
        } if (firstNumber < secondNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } if (firstNumber < thirdNumber && secondNumber < thirdNumber) {
            return thirdNumber;
        } if (firstNumber == secondNumber && secondNumber > thirdNumber) {
            return firstNumber;
        } if (firstNumber == thirdNumber && secondNumber < thirdNumber) {
            return firstNumber;
        } if (firstNumber < thirdNumber && secondNumber == thirdNumber) {
            return thirdNumber;
        } else { return firstNumber; }
    }
}
// реализуйте этот метод:
// return true - если число чётное (делится на 2 без остатка)
// иначе return false