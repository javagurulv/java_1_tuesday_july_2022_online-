package student_yurii_panasiuk.lesson_4.level_4_junior.Task_11_12_13_14_15;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class Calculator {

     int sum(int firstNumber, int secondNumber) {
            return firstNumber + secondNumber;
        }

     int sub(int firstNumber, int secondNumber) {
            return firstNumber - secondNumber;
        }

     int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

     int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    boolean isEven(int number) {

        if ((number % 2) == 0) { return true; }

        else {  return false; }
    }

    int maxOfTwoNumbers(int firstNumber, int secondNumber) {

        if (firstNumber > secondNumber) { return  firstNumber; }

        else if (firstNumber == secondNumber) {return firstNumber;} // ну незнаю что тут еще можно вернуть
        else { return secondNumber; }
    }

    int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int extra;
        if (firstNumber > secondNumber) {
            extra = firstNumber;
        }
        else {
            extra = secondNumber;
        }

        if (extra < thirdNumber){
            extra = thirdNumber;
        }
         return extra;
    }

    }




