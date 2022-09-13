/* Разработать класс PowerCalculator, который реализует единственный метод
для возведения заданного числа в указанную степень.
Название метода, список параметров и тип возвращаемого значения
придумайте самостоятельно согласно условию задачи.
Математическую операцию реализовать с использованием цикла.
Написать тестовые сценарии для класса PowerCalculator в классе PowerCalculatorTest.
Все тестовые сценарии должны отрабатывать без ошибок. */

package student_eduard_minajev.lesson_7_encapsulation.power_calculator;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class PowerCalculator {

    public int exponentNumber (int baseNumber, int exponentNumber){
        int power = 1;
        for (int i = 1; i <= exponentNumber; i++ ){
            power = power * baseNumber;
        } return power;
    }
}
