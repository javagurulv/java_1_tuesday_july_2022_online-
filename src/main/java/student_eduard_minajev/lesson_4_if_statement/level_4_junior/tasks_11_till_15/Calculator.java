package student_eduard_minajev.lesson_4_if_statement.level_4_junior.tasks_11_till_15;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Calculator {


    Calculator (){}

    public int sum (int firstNumber, int secondNumber){

        return firstNumber + secondNumber;
    }
    public int dif (int firstNumber, int secondNumber){

        return firstNumber - secondNumber;
    }
    public int mult (int firstNumber, int secondNumber){

        return firstNumber * secondNumber;
    }
    public int divid (int firstNumber, int secondNumber){

        return firstNumber / secondNumber;
    }
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers (int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (firstNumber < secondNumber) {
            return secondNumber;
        } else {
            return 0;
        }

    }
    
    public int maxOfThreeNumbers (int firstNumber, int secondNumber, int thirdNumber){
        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)){
            return firstNumber; //1
        } else if ((firstNumber < secondNumber) && (secondNumber > thirdNumber)) {
            return secondNumber; //2
        } else if ((firstNumber < thirdNumber) && (secondNumber < thirdNumber)) {
            return thirdNumber; //3
        } else if ((firstNumber == secondNumber) && (secondNumber > thirdNumber)) {
            return firstNumber; //4
        } else if ((firstNumber == thirdNumber) && (secondNumber < thirdNumber)) {
            return firstNumber; //5
        } else if ((firstNumber < thirdNumber) && (secondNumber == thirdNumber)) {
            return thirdNumber;//6
        } else { return 0;//7
        }
    }

}
