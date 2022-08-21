package student_eduard_minajev.lesson_4_if_statement.level_4_junior.tasks_11_till_15;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.difTest();
        calculatorTest.multTest();
        calculatorTest.dividTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersOne();
        calculatorTest.maxOfTwoNumbersTwo();
        calculatorTest.maxOfTwoNumbersThree();

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

    public void difTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.dif(firstNumber,secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Dif test = OK");
        }else{
            System.out.println("Dif test = FAIL");
        }
    }

    public void multTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.mult(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mult test = OK");
        }else{
            System.out.println("Mult test = FAIL");
        }
    }

    public void dividTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.divid(firstNumber,secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Divide test = OK");
        }else{
            System.out.println("Divide test = FAIL");
        }
    }

    public void isEvenTest (){
        int number = 4;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("Even test = OK");
        }else{
            System.out.println("Even test = FAIL");
        }
    }

    public void maxOfTwoNumbersOne (){
        int firstNumber = 9;
        int secondNumber = 4;
        int expectedResult = 9;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber,secondNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxNumberOne = OK");
        }else {
            System.out.println("MaxNumberOne = FAIL");
        }

    }

    public void maxOfTwoNumbersTwo (){
        int firstNumber = 4;
        int secondNumber = 9;
        int expectedResult = 9;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber,secondNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxNumberTwo = OK");
        }else {
            System.out.println("MaxNumberTwo = FAIL");
        }
    }

    public void maxOfTwoNumbersThree (){
        int firstNumber = 9;
        int secondNumber = 9;
        int expectedResult = 0;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber,secondNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxNumberThree = OK");
        }else {
            System.out.println("MaxNumberThree = FAIL");
        }
    }
}
