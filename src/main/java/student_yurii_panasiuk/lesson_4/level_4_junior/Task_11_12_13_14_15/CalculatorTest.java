package student_yurii_panasiuk.lesson_4.level_4_junior.Task_11_12_13_14_15;

import java.util.Arrays;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.Test(); // тут пусто


    }

      void Test() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int thirdNumber = 5;  // подготавливаем тестовые данные
        int fourthNumber = 1;  // подготавливаем тестовые данные
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
        int realResultLarger = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        int realResultSmaller = calculator.maxOfTwoNumbers(secondNumber, firstNumber);
        int realResulEqual = calculator.maxOfTwoNumbers(secondNumber, thirdNumber); // вызываем продакшен код, который хотим протестировать

        if ( realResultLarger == firstNumber ) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Larger test = OK");}
        else { System.out.println("Larger test = FAIL");}
        if ( realResultSmaller  != secondNumber ) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Smaller test = OK");}
        else { System.out.println("Smaller test = FAIL " + realResulEqual);}
        if ( realResulEqual  == secondNumber ) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Equal test = OK");}
        else { System.out.println("Equal test = FAIL");}
// все это странно так как calculator.maxOfTwoNumbers возврашает только большее число

          //System.out.println (calculator.maxOfThreeNumbers(1, 10, 3)); // ручной тест большее из трех чисел

          //сейчас будет автоматиченский тест  на большее из трех чисел (в виде заданных переменных) ))

        int [] numbers = new int [] {firstNumber, secondNumber, fourthNumber}; // сделаем массив для перебора всех возможных комбинаций
        int i1; // счетчик перебор вариантов в первой позиции массива
        int i2; // счетчик перебор вариантов в второй позиции массива
        int i3; // счетчик перебор вариантов в третьей позиции массива. можно было и по другому но я ошибся вначале с методом.
        int i4=0; // счетчик итераций, каждый раз увеличивается на 1
        int i5=0; // счетчик правильных ответов, каждый раз увеличивается на 1
        for(i1 = 0; i1 < numbers.length; i1 ++) {
             for (i2 = 0; i2 < numbers.length; i2++) {
                 for (i3 = 0; i3 < numbers.length; i3++) {
                     i4++;
                     int [] numbersSort = new int[]{numbers[i1], numbers[i2], numbers[(i3)]};
                     Arrays.sort(numbersSort); // сортируем  ))
                     if (calculator.maxOfThreeNumbers(numbers[i1], numbers[i2], numbers[(i3)]) == numbersSort[numbersSort.length-1]) {
                         i5++;
                     }
                      /* //  способ отслеживания результатов кода
                     System.out.print(i1 + " " +i2 + " " + i3 + "    "); // можно посмотреть коомбинации
                     System.out.print(i4 + " " + i5 + "    " ); // вывод счетчика правильных ответов
                     System.out.print(calculator.maxOfThreeNumbers(numbers[i1], numbers[i2], numbers[(i3)]) + "          ");
                     System.out.print(Arrays.toString(numbersSort) + "    " +
                                      numbers[i1] + " " +
                                      numbers[i2] + " " +
                                      numbers[i3] + " " + "\n" );
                       */

                 }
             }
         }
        if (i4 == i5){System.out.println("Test of the maximum of three integers = OK");}
        else { System.out.println("Test of the maximum of three integers = FAIL");}


        }

}