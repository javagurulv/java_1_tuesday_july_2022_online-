package student_ernest_aleskevics.lesson_4.level_4.task_11_till_15;

public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    public boolean isEven(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
    public int maxOfTwoNumbers(int firstNumber, int secondNumber){
        if (firstNumber > secondNumber){
           return firstNumber;
        } else if (firstNumber < secondNumber){
           return secondNumber;
        } else {
            return 0;
        }
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber){
        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)){
            return firstNumber;
        } else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            return secondNumber;
        } else if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber)) {
            return thirdNumber;
        } else if ((firstNumber == secondNumber) && (firstNumber > thirdNumber)) {
            return firstNumber;
        } else if ((firstNumber == thirdNumber) && (firstNumber > secondNumber)) {
            return firstNumber;
        } else if ((secondNumber == thirdNumber) && (secondNumber > firstNumber)) {
            return secondNumber;
        } else if ((firstNumber == secondNumber) && (firstNumber == thirdNumber)) {
            return firstNumber;
        } else {
            return 0;
        }

    }

}
