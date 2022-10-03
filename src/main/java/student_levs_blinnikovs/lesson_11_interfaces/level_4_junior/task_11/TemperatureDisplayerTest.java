package student_levs_blinnikovs.lesson_11_interfaces.level_4_junior.task_11;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class TemperatureDisplayerTest {

    public static void main(String[] args) {
        TemperatureDisplayerTest test = new TemperatureDisplayerTest();
        test.shouldDisplayCelsius();
        test.shouldDisplayFahrenheit();
        test.shouldDisplayKelvin();
    }


    void shouldDisplayCelsius() {
        TemperatureDisplayer celsiusDisplayer = new CelsiusDisplayer();
        double expectedCelsius = 0.0;
        double realCelsius = celsiusDisplayer.displayTemperature(0);
        printTestResult(expectedCelsius == realCelsius, "Celsius");
    }

    void shouldDisplayFahrenheit() {
        TemperatureDisplayer fahrehneitDisplayer = new FahrenheitDisplayer();
        double expectedFahrenheit = 32.0;
        double realFahrenheit = fahrehneitDisplayer.displayTemperature(0);
        printTestResult(expectedFahrenheit == realFahrenheit, "Fahrenheit");
    }

    void shouldDisplayKelvin() {
        TemperatureDisplayer kelvinDisplayer = new KelvinDisplayer();
        double expectedKelvin = 273.15;
        double realKelvin = kelvinDisplayer.displayTemperature(0);
        printTestResult(expectedKelvin == realKelvin, "Kelvin");
    }

}
