package student_levs_blinnikovs.lesson_11_interfaces.level_4_junior.task_11;

class TemperatureDisplayerDemo {
    public static void main(String[] args) {

        TemperatureDisplayer celsiusDisplayer = new CelsiusDisplayer();
        TemperatureDisplayer fahrehneitDisplayer = new FahrenheitDisplayer();
        TemperatureDisplayer kelvinDisplayer = new KelvinDisplayer();

        double celsiusTemp = celsiusDisplayer.displayTemperature(0);
        double fahrenheitTemp = fahrehneitDisplayer.displayTemperature(0);
        double kelvinTemp = kelvinDisplayer.displayTemperature(0);

        System.out.println("Celsius: " + celsiusTemp + "°C");
        System.out.println("Fahrenheit: " + fahrenheitTemp + "°F");
        System.out.println("Kelvin: " + kelvinTemp + "K");

    }
}
