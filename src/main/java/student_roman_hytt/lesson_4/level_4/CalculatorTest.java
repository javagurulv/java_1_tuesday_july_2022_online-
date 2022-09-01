package student_roman_hytt.lesson_4.level_4;

public class CalculatorTest {


    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
    }

    public void sumTest() {
        int firstNumber = 2;
        int secondNumber = 3;
        int sumResult = 5;

        Calculator calculator = new Calculator();

        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == sumResult) {
            System.out.println("True");
        } else { System.out.println("False");

        }


    }
}