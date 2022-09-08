package student_ernest_aleskevics.lesson_4.level_4.task_11_till_15;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfThreeNumbersTest();
    }

    public void sumTest() {
        int firstNumber = 1;
        int secondNumber = 2;
        int expectedResult = 3;

        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 3;
        int secondNumber = 2;
        int expectedResult = 1;

        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 3;
        int secondNumber = 2;
        int expectedResult = 6;

        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 6;
        int secondNumber = 2;
        int expectedResult = 3;

        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest() {
        int firstNumber = 9;
        int secondNumber = 7;
        int expectedResult = 9;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("Max number test = OK");
        } else {
            System.out.println("Max number test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest() {
        int firstNumber = 10;
        int secondNumber = 9;
        int thirdNumber = 9;
        int expectedResult = 10;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("Max number test = OK");
        } else {
            System.out.println("Max number test = FAIL");
        }
    }
}

