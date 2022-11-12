package student_olegs_radigins.lesson_11.level_4.task_12;

class KelvinConverter implements TemperatureConverter{
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
