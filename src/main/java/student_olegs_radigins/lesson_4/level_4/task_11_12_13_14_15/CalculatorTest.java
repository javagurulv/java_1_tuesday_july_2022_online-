package student_olegs_radigins.lesson_4.level_4.task_11_12_13_14_15;

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
        calculatorTest.theFirstNumberIsTheGreaterOfThree();
        calculatorTest.theSecondNumberIsTheGreaterOfThree();
        calculatorTest.theThirdNumberIsTheGreaterOfThree();
        calculatorTest.theFirstAndSecondAreEqualAndGreaterThanTheThird();
        calculatorTest.theFirstAndThirdAreEqualAndGreaterThanTheSecond();
        calculatorTest.theSecondAndThirdAreEqualAndGreaterThanTheFirst();
        calculatorTest.theThreeNumbersAreEqual();
        calculatorTest.theThreeNumbersAreZero();
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
    public void theFirstNumberIsTheGreaterOfThree() {

        Calculator calculator = new Calculator();
        int expectedResult = 15;
        int realResult = calculator.maxOfThreeNumbers(15, 10, 5);
        if (realResult == expectedResult) {
            System.out.println("Test for greater first number of three = OK");
        } else {
            System.out.println("Test for greater first number of three = FAIL");
        }
    }
    public void theSecondNumberIsTheGreaterOfThree() {

        Calculator calculator = new Calculator();
        int expectedResult = 15;
        int realResult = calculator.maxOfThreeNumbers(10, 15, 5);
        if (realResult == expectedResult) {
            System.out.println("Test for greater second number of three = OK");
        } else {
            System.out.println("Test for greater second number of three = FAIL");
        }
    }
    public void theThirdNumberIsTheGreaterOfThree() {

        Calculator calculator = new Calculator();
        int expectedResult = 15;
        int realResult = calculator.maxOfThreeNumbers(5, 10, 15);
        if (realResult == expectedResult) {
            System.out.println("Test for greater third number of three = OK");
        } else {
            System.out.println("Test for greater third number of three = FAIL");
        }
    }
    public void theFirstAndSecondAreEqualAndGreaterThanTheThird() {

        Calculator calculator = new Calculator();
        int expectedResult = 15;
        int realResult = calculator.maxOfThreeNumbers(15, 15, 5);
        if (realResult == expectedResult) {
            System.out.println("Test for the first and second are equal and greater than the third = OK");
        } else {
            System.out.println("Test for the first and second are equal and greater than the third = FAIL");
        }
    }
    public void theFirstAndThirdAreEqualAndGreaterThanTheSecond() {

        Calculator calculator = new Calculator();
        int expectedResult = 15;
        int realResult = calculator.maxOfThreeNumbers(15, 5, 15);
        if (realResult == expectedResult) {
            System.out.println("Test for the first and third are equal and greater than the second = OK");
        } else {
            System.out.println("Test for the first and third are equal and greater than the second = FAIL");
        }
    }
    public void theSecondAndThirdAreEqualAndGreaterThanTheFirst() {

        Calculator calculator = new Calculator();
        int expectedResult = 15;
        int realResult = calculator.maxOfThreeNumbers(5, 15, 15);
        if (realResult == expectedResult) {
            System.out.println("Test for the second and third are equal and greater than the first = OK");
        } else {
            System.out.println("Test for the second and third are equal and greater than the first = FAIL");
        }
    }
    public void theThreeNumbersAreEqual() {

        Calculator calculator = new Calculator();
        int expectedResult = 15;
        int realResult = calculator.maxOfThreeNumbers(15, 15, 15);
        if (realResult == expectedResult) {
            System.out.println("Test for equality of three numbers = OK");
        } else {
            System.out.println("Test for equality of three numbers = FAIL");
        }
    }
    public void theThreeNumbersAreZero() {

        Calculator calculator = new Calculator();
        int expectedResult = 0;
        int realResult = calculator.maxOfThreeNumbers(0,0,0);
        if (realResult == expectedResult) {
            System.out.println("Test for Zero = OK");
        } else {
            System.out.println("Test for Zero = FAIL");
        }
    }

}
