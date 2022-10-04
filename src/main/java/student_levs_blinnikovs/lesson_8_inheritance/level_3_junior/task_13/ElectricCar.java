package student_levs_blinnikovs.lesson_8_inheritance.level_3_junior.task_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ElectricCar extends Car {

    private int batteryCharge;

    void accelerate() {
        batteryCharge--;
    }
}
