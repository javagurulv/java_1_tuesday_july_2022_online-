package student_levs_blinnikovs.lesson_7_encapsulation.level_5_middle.task_9;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class PowerCalculatorTest {

    public static void main(String[] args) {

        PowerCalculatorTest test = new PowerCalculatorTest();

        // power 0
        test.shouldCalculatePower(0, 0, 1);
        test.shouldCalculatePower(1, 0, 1);
        test.shouldCalculatePower(2, 0, 1);

        // power 1
        test.shouldCalculatePower(0, 1, 0);
        test.shouldCalculatePower(1,1,1);
        test.shouldCalculatePower(2, 1, 2);

        // base 0
        test.shouldCalculatePower(0, 1, 0);
        test.shouldCalculatePower(0, 2, 0);

        // base 1
        test.shouldCalculatePower(1,2,1);
        test.shouldCalculatePower(1, 3, 1);

        // normal
        test.shouldCalculatePower(2,2,4);
        test.shouldCalculatePower(2,3,8);

        // negative
        test.shouldCalculatePower(2, -1, 0.5);
        test.shouldCalculatePower(2, -2, 0.25);
        test.shouldCalculatePower(2, -3, 0.125);

    }

    void shouldCalculatePower(int base, int power, double expectedResult) {
        PowerCalculator powerCalculator = new PowerCalculator();
        double realResult = powerCalculator.power(base, power);
        printTestResult(expectedResult == realResult);
    }

}
