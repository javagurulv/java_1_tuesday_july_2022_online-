package student_levs_blinnikovs.lesson_11_interfaces.level_4_junior.task_11_12;

public class KelvinDisplayer implements TemperatureDisplayer {
    @Override
    public double displayTemperature(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}