package student_levs_blinnikovs.lesson_11_interfaces.level_4_junior.task_11_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FahrenheitDisplayer implements TemperatureDisplayer {
    @Override
    public double displayTemperature(double celsiusTemperature) {
        return celsiusTemperature * (9D / 5D) + 32;
    }
}
