package student_levs_blinnikovs.lesson_4_if_statement.level_4_junior.task_11_15;

/*
Тестирование своего кода - это очень важный навык, которому
мы хотим вас научить. В реальном мире ИТ не достаточно просто
написать код программы реализовав в ней бизнес требования заказчика.
Нужно обязательно убедиться в том, что ваша программа работает
правильно!

Зачем тестировать свой код? Мы все люди, а людям свойственно
ошибаться, и программисты тут не исключение! При создании
больших и маленьких программ очень просто допустить ошибку,
упустить из виду маленькую деталь, которая на самом деле
очень важна для заказчика. Все программисты делают ошибки
в своём коде. Цель тестирования: найти эти ошибки как можно
быстрее! Желательно до того как ваш код начнёт работать
на продакшен среде.

Протестировать код можно по крайней мере двумя способами:
1. Протестировать вашу программу руками - "ручное тестирование";
2. Написать автоматические тесты - "автоматизация тестирования".

Давайте рассмотрим "ручное тестирование". После того, как вы
написали программу, вы можете её запустить, ввести тесторые данные
(например с консоли руками) и проверить результат, который выдаст
ваша программа. Если результат окажется правильным, тоесть тем
который вы ожидали получить значит ваша программа сработала
правильно. Если результат будет другим, значит программа работает
не правильно и ее надо исправлять.

Почему "ручное тестирование" называется именно так? Потому что
при его использовании вам приходится вводить данные в ручную,
тоесть "ручное тестирование" для выполнения теста
требует наличие человека. Человек это очень ценный ресурс!
Поэтому "ручное тестирование" очень дорогой и трудоёмкий процесс.

Большим недостатком "ручного тестирования" является тот факт, что
при любых изменениях в программе вам нужно повторить все тесты, а
это занимает много времени и человеческого ресурса.

Кому из программистов захочется снова и снова повторять
рутинные шаги "ручного тестирования" после каждых изменений?

Автоматические тесты - это отличный вариант замены
"ручного тестирования". Один раз написав автоматический тест
его можно запускать сколько угодно раз, ведь автоматический тест
это маленькая программа, которая тестирует другую вашу программу.
Написал один раз - запускай сколько угодно раз. Автоматические тесты
пишутся так, что для их выполнения не нужен человек. Все входные
данные и ожидаемые результаты подготовлены заранее. Автоматические
тесты работают быстро, за доли секунды вы можете получить результат
работы вашего теста. То же самое только в "ручном тестировании" вы
бы проверяли несколько часов.

Именно поэтому программисты профессионалы тестируют свои программы
при помощи автоматических тестов!

Создайте класс CalculatorTest и напишите автоматические тесты для
всех методов класса Calculator из предыдущего задания.

Подсказка:

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        // по аналогии реализуйте тесты для остальных методов
    }

    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

}

Добавьте в класс Calculator метод для определения
максимального из двух целых чисел.

Добавьте в класс CalculatorTest тесты для этого метода.
Тесты должны покрывать следующие тестовые сценарии:
- первое число больше второго
- второе число больше первого
- оба числа равны
Создайте по одному тесту на каждый из сценариев!


Подсказка:

class Calculator {

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        // реализуйте этот метод
    }

}

 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CalculatorTest {

    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subtractTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtract(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtract test = OK");
        } else {
            System.out.println("Subtract test = FAIL");
        }
    }

    public void divideTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }

    public void divideZeroTest() {
        int firstNumber = 10;
        int secondNumber = 0;
        int expectedResult = -1;
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Divide zero error test = OK");
        } else {
            System.out.println("Divide zero error test = FAIL");
        }
    }

    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }

    public void evenTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
    }

    public void oddTest() {
        int firstNumber = 10;
        int secondNumber = 4;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Odd test = OK");
        } else {
            System.out.println("Odd test = FAIL");
        }
    }

    public void maxOfTwoNumbersFirstHigherTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of two numbers - first highest test = OK");
        } else {
            System.out.println("Max of two numbers - first highest test = FAIL");
        }
    }

    public void maxOfTwoNumbersSecondHigherTest() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of two numbers - second highest test = OK");
        } else {
            System.out.println("Max of two numbers - second highest test = FAIL");
        }
    }

    public void maxOfTwoNumbersEqualTest() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of two numbers - equal test = OK");
        } else {
            System.out.println("Max of two numbers - equal test = FAIL");
        }
    }

    public void maxOfThreeNumbersAllEqualTest() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of three numbers - equal test = OK");
        } else {
            System.out.println("Max of three numbers - equal test = FAIL");
        }
    }

    public void maxOfThreeNumbersFirstAndThirdEqualAndHigherTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of three numbers = OK");
        } else {
            System.out.println("Max of three numbers = FAIL");
        }
    }

    public void maxOfThreeNumbersLastTwoEqualAndHigherTest() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of three numbers = OK");
        } else {
            System.out.println("Max of three numbers = FAIL");
        }
    }

    public void maxOfThreeNumbersFirstTwoEqualAndHigherTest() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of three numbers = OK");
        } else {
            System.out.println("Max of three numbers = FAIL");
        }
    }

    public void maxOfThreeNumbersThirdHighestTest() {
        int firstNumber = 5;
        int secondNumber = 6;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of three numbers = OK");
        } else {
            System.out.println("Max of three numbers = FAIL");
        }
    }

    public void maxOfThreeNumbersSecondHighestTest() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 6;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of three numbers = OK");
        } else {
            System.out.println("Max of three numbers = FAIL");
        }
    }

    public void maxOfThreeNumbersFirstHighestTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 6;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of three numbers = OK");
        } else {
            System.out.println("Max of three numbers = FAIL");
        }
    }

    public void maxOfThreeNumbersFirstHighestOtherSameTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of three numbers = OK");
        } else {
            System.out.println("Max of three numbers = FAIL");
        }
    }

    public void maxOfThreeNumbersSecondHighestOtherSameTest() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of three numbers = OK");
        } else {
            System.out.println("Max of three numbers = FAIL");
        }
    }

    public void maxOfThreeNumbersThirdHighestOtherSameTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of three numbers = OK");
        } else {
            System.out.println("Max of three numbers = FAIL");
        }
    }

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractTest();

        calculatorTest.divideTest();
        calculatorTest.divideZeroTest();

        calculatorTest.multiplyTest();

        calculatorTest.evenTest();
        calculatorTest.oddTest();

        calculatorTest.maxOfTwoNumbersFirstHigherTest();
        calculatorTest.maxOfTwoNumbersSecondHigherTest();
        calculatorTest.maxOfTwoNumbersEqualTest();

        calculatorTest.maxOfThreeNumbersFirstHighestTest();
        calculatorTest.maxOfThreeNumbersSecondHighestTest();
        calculatorTest.maxOfThreeNumbersThirdHighestTest();

        calculatorTest.maxOfThreeNumbersFirstTwoEqualAndHigherTest();
        calculatorTest.maxOfThreeNumbersLastTwoEqualAndHigherTest();
        calculatorTest.maxOfThreeNumbersFirstAndThirdEqualAndHigherTest();

        // maybe too many scenarios... unnecessary?
        calculatorTest.maxOfThreeNumbersFirstHighestOtherSameTest();
        calculatorTest.maxOfThreeNumbersSecondHighestOtherSameTest();
        calculatorTest.maxOfThreeNumbersThirdHighestOtherSameTest();

        calculatorTest.maxOfThreeNumbersAllEqualTest();

    }

}
