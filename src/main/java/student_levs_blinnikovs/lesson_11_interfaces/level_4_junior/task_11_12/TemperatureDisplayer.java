package student_levs_blinnikovs.lesson_11_interfaces.level_4_junior.task_11_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface TemperatureDisplayer {

    // considered that celsiusTemperature input is always celsius by some service
    double displayTemperature(double celsiusTemperature);

}
