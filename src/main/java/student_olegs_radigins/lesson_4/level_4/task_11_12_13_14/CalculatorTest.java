package student_olegs_radigins.lesson_4.level_4.task_11_12_13_14;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiply();
        calculatorTest.divide();
        calculatorTest.isEven();
        calculatorTest.theFirstNumberIsTheGreaterOfTheTwo();
        calculatorTest.theSecondNumberIsTheGreaterOfTheTwo();
        calculatorTest.bothNumbersAreEqual();
          }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }

    }
    public void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }

    }

    public void multiply() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }

    }

    public void divide() {
        int firstNumber = 15;
        int secondNumber = 5;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }

    }
    public void isEven() {
        int number = 15;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }


    }
    public void theFirstNumberIsTheGreaterOfTheTwo(){
        int firstNumber = 15;
        int secondNumber = 5;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.theFirstNumberIsTheGreaterOfTheTwo(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Test for greater first number = OK");
        } else {
            System.out.println("Test for greater first number = FAIL");
        }

    }

    public void theSecondNumberIsTheGreaterOfTheTwo(){
        int firstNumber = 15;
        int secondNumber = 5;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.theSecondNumberIsTheGreaterOfTheTwo(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Test for greater second number = OK");
        } else {
            System.out.println("Test for greater second number = FAIL");
        }

    }

    public void bothNumbersAreEqual(){
        int firstNumber = 15;
        int secondNumber = 5;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.bothNumbersAreEqual(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Test for equality of two numbers = OK");
        } else {
            System.out.println("Test for equality of two numbers = FAIL");
        }

    }
}
