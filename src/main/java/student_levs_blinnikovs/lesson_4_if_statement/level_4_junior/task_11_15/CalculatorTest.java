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

Найдите способ упростить тесты в CalculatorTest.

Тесты тоже должны быть написаны как можно лучше и качественнее!
Дублирование кода - это почти всегда плохая идея в программировании.
Поэтому от дублирования кода нужно избавляться.

Подсказка: вынесите в отдельный метод проверку
результата и замените её вызовом метода в каждом тесте.
 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CalculatorTest {

    public void compareRealExpected(int realResult, int expectedResult) {
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    public void compareRealExpected(boolean realResult, boolean expectedResult) {
        if (realResult == expectedResult) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
    }

    public void sumTest(int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        compareRealExpected(realResult, expectedResult);
    }

    public void subtractTest(int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int realResult = calculator.subtract(firstNumber, secondNumber);
        compareRealExpected(realResult, expectedResult);
    }

    public void divideTest(int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(firstNumber, secondNumber);
        compareRealExpected(realResult, expectedResult);
    }

    public void multiplyTest(int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber);
        compareRealExpected(realResult, expectedResult);
    }

    public void isEvenTest(int firstNumber, int secondNumber, boolean expectedResult) {
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(firstNumber, secondNumber);
        compareRealExpected(realResult, expectedResult);
    }

    public void maxOfTwoNumbersTest(int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        compareRealExpected(realResult, expectedResult);
    }

    public void maxOfThreeNumbersTest(int firstNumber, int secondNumber, int thirdNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        compareRealExpected(realResult, expectedResult);
    }

    public static void main(String[] args) {

        CalculatorTest test = new CalculatorTest();

        test.sumTest(10, 5, 15);
        test.subtractTest(10, 5, 5);

        test.divideTest(10, 5, 2);
        test.divideTest(10, 0, -1);

        test.multiplyTest(10, 5, 50);

        test.isEvenTest(10, 5, true);
        test.isEvenTest(10, 4, false);

        test.maxOfTwoNumbersTest(10, 5, 10);
        test.maxOfTwoNumbersTest(10, 20, 20);
        test.maxOfTwoNumbersTest(10, 10, 10);

        test.maxOfThreeNumbersTest(10, 2, 5, 10);
        test.maxOfThreeNumbersTest(10, 20, 5, 20);
        test.maxOfThreeNumbersTest(10, 20, 50, 50);

        test.maxOfThreeNumbersTest(10, 10, 5, 10);
        test.maxOfThreeNumbersTest(5, 10, 10, 10);
        test.maxOfThreeNumbersTest(10, 2, 10, 10);

        test.maxOfThreeNumbersTest(10, 10, 10, 10);

    }

}
