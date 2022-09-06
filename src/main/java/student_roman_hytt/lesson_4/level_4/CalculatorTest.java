package student_roman_hytt.lesson_4.level_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.divTest();
        calculatorTest.mulTest();
        calculatorTest.subTest();
        calculatorTest.sumTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfThreeNumbersTest();

    }


    public void divTest() {
        int firstNumber = 6;
        int secondNumber = 3;
        int sumResult = 2;

        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == sumResult) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public void mulTest() {
        int firstNumber = 6;
        int secondNumber = 3;
        int sumResult = 18;

        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == sumResult) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public void subTest() {
        int firstNumber = 6;
        int secondNumber = 3;
        int sumResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == sumResult) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public void sumTest() {
        int firstNumber = 2;
        int secondNumber = 3;
        int sumResult = 5;

        Calculator calculator = new Calculator();

        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == sumResult) {
            System.out.println("True");
        } else {
            System.out.println("False");

        }
    }

    public boolean isEvenTest() {
        int number = 4;
        boolean result = true;

        Calculator calculator = new Calculator();

        boolean realResult = calculator.isEven(number);
        if (realResult == result) {
            System.out.println("True");
        } else {
            System.out.println("False");

        }
        return result;
    }


    private void maxOfTwoNumbersTest(){
     int fistNumber=2;
     int secondNumber=5;
     int result=5;

     Calculator calculator=new Calculator();
      int realResult= calculator.maxOfTwoNumbers(fistNumber,secondNumber);
      if (realResult==result) {
        System.out.println("True");}
        else {System.out.println("False");}

    }

private void maxOfThreeNumbersTest() {
    int firstNumber = 6;
    int secondNumber = 4;
    int thirdNumber = 9;
    int result = 9;

    Calculator calculator = new Calculator();

    int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
    if (realResult == result) {
        System.out.println("True");
    } else {
        System.out.println("False");}
    }

}














