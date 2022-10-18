package student_levs_blinnikovs.lesson_11_interfaces.level_4_junior.task_11_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CelsiusDisplayer implements TemperatureDisplayer {
    @Override
    public double displayTemperature(double celsiusTemperature) {
        return celsiusTemperature;
    }
}
