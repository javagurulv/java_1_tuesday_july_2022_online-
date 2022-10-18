package student_levs_blinnikovs.lesson_11_interfaces.level_4_junior.task_11_12;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TemperatureDisplayerTest {

    public static void main(String[] args) {
        TemperatureDisplayerTest test = new TemperatureDisplayerTest();
        test.shouldDisplayTemperature(0, 0.0, new CelsiusDisplayer());
        test.shouldDisplayTemperature(0, 32.0, new FahrenheitDisplayer());
        test.shouldDisplayTemperature(0, 273.15, new KelvinDisplayer());
    }

    void shouldDisplayTemperature(double celsius, double expected, TemperatureDisplayer displayer) {
        double real = displayer.displayTemperature(celsius);
        printTestResult(expected == real, displayer.getClass().getSimpleName());
    }

}
