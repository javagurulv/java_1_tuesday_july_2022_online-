package student_levs_blinnikovs.lesson_4_if_statement.level_4_junior_7_senior.task_11_15_24;

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

import teacher.codereview.CodeReviewComment;

import java.util.function.Function;

@CodeReviewComment(student = "I'd like to try to pass Calculator obj function call in test function calls e.g. testGeneric(int a, int b, Calculator method()..). How to do it?")
class CalculatorTest {

    public void compareRealExpected(int realResult, int expectedResult, String testScenario) {
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println(testScenario + " test = OK\n");
        } else {
            System.out.println(testScenario + " test = FAIL\n");
        }
    }

    public void compareRealExpected(boolean realResult, boolean expectedResult, String testScenario) {
        if (realResult == expectedResult) {
            System.out.println(testScenario + " test = OK\n");
        } else {
            System.out.println(testScenario + " test = FAIL\n");
        }
    }

    // Function ... or lambdas. TODO
    public void sumTest(int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        compareRealExpected(realResult, expectedResult, "Sum");
    }

    public void subtractTest(int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int realResult = calculator.subtract(firstNumber, secondNumber);
        compareRealExpected(realResult, expectedResult, "Subtract");
    }

    public void divideTest(int firstNumber, int secondNumber, int expectedResult, String testScenario) {
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(firstNumber, secondNumber);
        compareRealExpected(realResult, expectedResult, testScenario);
    }

    public void multiplyTest(int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber);
        compareRealExpected(realResult, expectedResult, "Multiply");
    }

    public void isEvenTest(int firstNumber, int secondNumber, boolean expectedResult, String testScenario) {
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(firstNumber, secondNumber);
        compareRealExpected(realResult, expectedResult, testScenario);
    }

    public void maxOfTest(int firstNumber, int secondNumber, int expectedResult, String testScenario) {
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOf(firstNumber, secondNumber);
        compareRealExpected(realResult, expectedResult, testScenario);
    }

    public void maxOfTest(int firstNumber, int secondNumber, int thirdNumber, int expectedResult, String testScenario) {
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOf(firstNumber, secondNumber, thirdNumber);
        compareRealExpected(realResult, expectedResult, testScenario);
    }

    public static void main(String[] args) {

        CalculatorTest test = new CalculatorTest();

        test.sumTest(10, 5, 15);

        test.subtractTest(10, 5, 5);

        test.multiplyTest(10, 5, 50);

        test.divideTest(10, 5, 2, "Divide");
        test.divideTest(10, 0, -1, "Divide by zero");

        test.isEvenTest(10, 5, true, "Even");
        test.isEvenTest(10, 4, false, "Odd");

        test.maxOfTest(10, 5, 10, "First of two is highest");
        test.maxOfTest(10, 20, 20, "Second of two is highest");
        test.maxOfTest(10, 10, 10, "Both are equal");

        test.maxOfTest(10, 2, 5, 10, "First of three is highest");
        test.maxOfTest(10, 20, 5, 20, "Middle of three is highest");
        test.maxOfTest(10, 20, 50, 50, "Third is highest");

        test.maxOfTest(10, 10, 5, 10, "First two of three are highest");
        test.maxOfTest(5, 10, 10, 10, "Last two of three are highest");
        test.maxOfTest(10, 2, 10, 10, "First and last of three are highest");

        test.maxOfTest(10, 10, 10, 10, "All three equal");

    }

}
