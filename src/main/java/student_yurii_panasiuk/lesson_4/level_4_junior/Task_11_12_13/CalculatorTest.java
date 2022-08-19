package student_yurii_panasiuk.lesson_4.level_4_junior.Task_11_12_13;

 class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.Test();


    }

    public  void Test() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int thirdNumber = 5;  // подготавливаем тестовые данные
        int expectedResultSum = 15;  // подготавливаем тестовые данные
        int expectedResultSub = 5;  // подготавливаем тестовые данные
        int expectedResultMul = 50;  // подготавливаем тестовые данные
        int expectedResultDiv = 2;  // подготавливаем тестовые данные

        Calculator calculator = new Calculator();

        int realResultSum = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResultSum == expectedResultSum) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }

        int realResultSub = calculator.sub(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResultSub == expectedResultSub) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sub test = OK");
        } else {
            System.out.println("SuB test = FAIL");
        }

        int realResultDiv = calculator.div(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResultDiv == expectedResultDiv) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }

        int realResultMul = calculator.mul(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResultMul == expectedResultMul) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }

        boolean realResultEven = calculator.isEven(firstNumber);
        boolean realResultOdd = calculator.isEven(secondNumber); // вызываем продакшен код, который хотим протестировать

        if ( realResultEven  && !realResultOdd ) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Even/Odd test = OK");
        } else {
            System.out.println("Mul Even/Odd = FAIL");
        }
        int realResulеLarger = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        int realResulеSmaller = calculator.maxOfTwoNumbers(secondNumber, firstNumber);
        int realResulEqual = calculator.maxOfTwoNumbers(secondNumber, thirdNumber);

        if ( realResulеLarger  == firstNumber ) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Larger test = OK");}
        if ( realResulеSmaller  == secondNumber ) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Smaller test = OK");}
        if ( realResulEqual  == secondNumber ) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Equal test = OK");}


}
}