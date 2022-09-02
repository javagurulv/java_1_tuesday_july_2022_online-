
package student_sobit_eshniyozov.lesson_4_if_statement.level_4;

class CalculatorTest2 {
    public static void main(String[] args) {
        CalculatorTest2 calculatorTest = new CalculatorTest2();
        calculatorTest.sumTest();
        calculatorTest.subtractTest();
        calculatorTest.divideTest();
        calculatorTest.multiplyTest();
        calculatorTest.isEven();
        calculatorTest.maxOfTwoNumbersFirst();
        calculatorTest.maxOfTwoNumbersSecond();
        calculatorTest.maxOfTwoNumbersThird();
        calculatorTest.maxOfThreeNumbersVersionOne();
        calculatorTest.maxOfThreeNumbersVersionTwo();
        calculatorTest.maxOfThreeNumbersVersionThree();
        calculatorTest.maxOfThreeNumbersVersionFour();
        calculatorTest.maxOfThreeNumbersVersionFive();
        calculatorTest.maxOfThreeNumbersVersionSix();
        calculatorTest.maxOfThreeNumbersVersionSeven();



        // по аналогии реализуйте тесты для остальных методов
    }

    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшн код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void subtractTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 5;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.subtract(firstNumber, secondNumber);  // вызываем продакшн код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }
    public void divideTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 2;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(firstNumber, secondNumber);  // вызываем продакшн код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }
    public void multiplyTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 50;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber);  // вызываем продакшн код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }
    public void isEven() {
        int number = 9;  // подготавливаем тестовые данные
        boolean expectedResult = true;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);  // вызываем продакшн код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
    }
    public void maxOfTwoNumbersFirst() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 9;  // подготавливаем тестовые данные
        int expectedResult = 10;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшн код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of two number test1 = OK");
        } else {
            System.out.println("Max of two number test1 = FAIL");
        }
    }
    public void maxOfTwoNumbersSecond() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 11;  // подготавливаем тестовые данные
        int expectedResult = 11;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшн код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of two number test2 = OK");
        } else {
            System.out.println("Max of two number test2 = FAIL");
        }
    }
    public void maxOfTwoNumbersThird() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 10;  // подготавливаем тестовые данные
        int expectedResult = 10;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшн код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of two number test3 = OK");
        } else {
            System.out.println("Max of two number test3 = FAIL");
        }
    }

    public void maxOfThreeNumbersVersionOne() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 9;  // подготавливаем тестовые данные
        int thirdNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 10;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbersVersion(firstNumber, secondNumber,thirdNumber);  // вызываем продакшн код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of three number test1 = OK");
        } else {
            System.out.println("Max of three number test1 = FAIL");
        }
    }
    public void maxOfThreeNumbersVersionTwo() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 11;  // подготавливаем тестовые данные
        int thirdNumber = 9;  // подготавливаем тестовые данные
        int expectedResult = 11;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbersVersion(firstNumber, secondNumber,thirdNumber);  // вызываем продакшн код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of three number test2 = OK");
        } else {
            System.out.println("Max of three number test2 = FAIL");
        }
    }
    public void maxOfThreeNumbersVersionThree() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 9;  // подготавливаем тестовые данные
        int thirdNumber = 11;  // подготавливаем тестовые данные
        int expectedResult = 11;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbersVersion(firstNumber, secondNumber,thirdNumber);  // вызываем продакшн код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of three number test3 = OK");
        } else {
            System.out.println("Max of three number test3 = FAIL");
        }
    }
    public void maxOfThreeNumbersVersionFour() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 10;  // подготавливаем тестовые данные
        int thirdNumber = 9;  // подготавливаем тестовые данные
        int expectedResult = 10;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbersVersion(firstNumber, secondNumber,thirdNumber);  // вызываем продакшн код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of three number test4 = OK");
        } else {
            System.out.println("Max of three number test4 = FAIL");
        }
    }
    public void maxOfThreeNumbersVersionFive() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 9;  // подготавливаем тестовые данные
        int thirdNumber = 10;  // подготавливаем тестовые данные
        int expectedResult = 10;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbersVersion(firstNumber, secondNumber,thirdNumber);  // вызываем продакшн код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of three number test5 = OK");
        } else {
            System.out.println("Max of three number test5 = FAIL");
        }
    }
    public void maxOfThreeNumbersVersionSix() {
        int firstNumber = 2;  // подготавливаем тестовые данные
        int secondNumber = 9;  // подготавливаем тестовые данные
        int thirdNumber = 9;  // подготавливаем тестовые данные
        int expectedResult = 9;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbersVersion(firstNumber, secondNumber,thirdNumber);  // вызываем продакшн код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of three number test6 = OK");
        } else {
            System.out.println("Max of three number test6 = FAIL");
        }
    }
    public void maxOfThreeNumbersVersionSeven() {
        int firstNumber = 9;  // подготавливаем тестовые данные
        int secondNumber = 9;  // подготавливаем тестовые данные
        int thirdNumber = 9;  // подготавливаем тестовые данные
        int expectedResult = 9;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbersVersion(firstNumber, secondNumber,thirdNumber);  // вызываем продакшн код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of three number test7 = OK");
        } else {
            System.out.println("Max of three number test7 = FAIL");
        }
    }



}


