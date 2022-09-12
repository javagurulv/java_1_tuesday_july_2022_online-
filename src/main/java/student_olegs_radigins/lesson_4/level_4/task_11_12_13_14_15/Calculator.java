package student_olegs_radigins.lesson_4.level_4.task_11_12_13_14_15;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
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
    public boolean isEven(int number){
        return number % 2 == 0;
    }

    public boolean theFirstNumberIsTheGreaterOfTheTwo (int firstNumber, int secondNumber){
        return firstNumber > secondNumber;
    }

    public boolean theSecondNumberIsTheGreaterOfTheTwo (int firstNumber, int secondNumber){
        return firstNumber < secondNumber;
    }

    public boolean bothNumbersAreEqual (int firstNumber, int secondNumber){
        return firstNumber == secondNumber;
    }

    public int maxOfThreeNumbers (int firstNumber,int secondNumber, int thirdNumber) {

        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
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

