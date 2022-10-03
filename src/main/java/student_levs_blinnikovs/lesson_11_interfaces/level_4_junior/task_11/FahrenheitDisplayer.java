package student_levs_blinnikovs.lesson_11_interfaces.level_4_junior.task_11;

class FahrenheitDisplayer implements TemperatureDisplayer {
    @Override
    public double displayTemperature(double celsiusTemperature) {
        return celsiusTemperature * (9D / 5D) + 32;
    }
}
