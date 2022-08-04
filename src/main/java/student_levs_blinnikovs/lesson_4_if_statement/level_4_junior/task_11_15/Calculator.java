package student_levs_blinnikovs.lesson_4_if_statement.level_4_junior.task_11_15;

/*
Создайте класс Calculator. В этом классе создайте методы
для сложения, вычитания, деления и умножения двух целых чисел.

Подсказка:

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    // реализуйте по аналогии оставшиеся методы

}
 */

// Task 13
/*
Добавьте в класс Calculator метод для определения
        чётное число или не чётное.

        Добавьте в класс CalculatorTest тесты для этого метода.

        Подсказка:

class Calculator {

    public boolean isEven(int number) {
        // реализуйте этот метод:
        // return true - если число чётное (делится на 2 без остатка)
        // иначе return false
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

Task 15
Добавьте в класс Calculator метод для определения
максимального из трёх целых чисел.

Добавьте в класс CalculatorTest тесты для этого метода.
Тесты должны покрывать следующие тестовые сценарии:
- первое число больше второго и третьего
- второе число больше первого и третьего
- третье число больше первого и второго
- первые два равны и больше третьего
- ...
- три числа равны
По одному тесту на каждый из сценариев!

 */


class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            System.out.println("Cannot divide by zero!");
            return -1;
        }
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int firstNumber, int secondNumber) {
        return firstNumber % secondNumber == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber) {
            return secondNumber;
        } else {
            System.out.println("No maximum, numbers are equal!");
            return -1;
        }
    }

    /*
    public boolean areAllSame() {
        return firstNumber == secondNumber && firstNumber == thirdNumber;
    }

    public boolean isFirstPosHighest() {
        return firstNumber > secondNumber && firstNumber > thirdNumber;
    }

    public boolean isSecondPosHighest() {
        return secondNumber > firstNumber && secondNumber > thirdNumber;
    }

    public boolean isThirdPosHighest() {
        return thirdNumber > firstNumber && thirdNumber > secondNumber;
    }

    String checkHighest() {
        if (areAllSame()) { // technically then highest is any number (?)
            return "All three numbers are same.";
        } else if (isFirstPosHighest()) { // first pos scenario + at first pos, other - same
            return "First number is highest. It's value is " + firstNumber;
        } else if (isSecondPosHighest()) { // second pos scenario + at middle pos, other - same
            return "Second number is highest. It's value is " + secondNumber;
        } else if (isThirdPosHighest()) { // last pos scenario + at last pos, other - same
            return "Third number is highest. It's value is " + thirdNumber;
        } else { // two similar, no highest ... technically then highest is one of those that are same (?)
            return "There is no highest number as two of the numbers are same.";
        }
    }

     */

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        return -1;
    }




}
