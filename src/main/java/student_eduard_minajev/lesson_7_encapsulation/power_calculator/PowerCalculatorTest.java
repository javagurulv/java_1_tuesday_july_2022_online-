package student_eduard_minajev.lesson_7_encapsulation.power_calculator;

public class PowerCalculatorTest {

    public static void main(String[] args) {
    PowerCalculatorTest test = new PowerCalculatorTest();
    test.shouldGiveTwo();
    test.shouldGiveOne();
    test.shouldGive125();
    test.shouldGiveNine();
    test.shouldGiveMinus27();
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    public void shouldGiveTwo () {
        PowerCalculator powerCalculator = new PowerCalculator();
        int result = powerCalculator.exponentNumber(2,1);
        checkTestResult(result == 2, "shouldGiveTwo");
    }

    public void shouldGiveOne () {
        PowerCalculator powerCalculator = new PowerCalculator();
        int result = powerCalculator.exponentNumber(7,0);
        checkTestResult(result == 1, "shouldGiveOne");
    }

    public void shouldGive125 () {
        PowerCalculator powerCalculator = new PowerCalculator();
        int result = powerCalculator.exponentNumber(5,3);
        checkTestResult(result == 125, "shouldGive125");
    }

    public void shouldGiveNine () {
        PowerCalculator powerCalculator = new PowerCalculator();
        int result = powerCalculator.exponentNumber(-3,2);
        checkTestResult(result == 9, "shouldGiveNine");
    }

    public void shouldGiveMinus27 () {
        PowerCalculator powerCalculator = new PowerCalculator();
        int result = powerCalculator.exponentNumber(-3,3);
        checkTestResult(result == -27, "shouldGiveMinus27");
    }

}
