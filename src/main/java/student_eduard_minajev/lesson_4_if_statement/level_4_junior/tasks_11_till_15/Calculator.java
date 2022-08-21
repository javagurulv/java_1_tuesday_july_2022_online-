package student_eduard_minajev.lesson_4_if_statement.level_4_junior.tasks_11_till_15;

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

}
