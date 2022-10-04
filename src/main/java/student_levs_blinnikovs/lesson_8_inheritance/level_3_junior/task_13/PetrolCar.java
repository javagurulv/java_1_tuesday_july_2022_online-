package student_levs_blinnikovs.lesson_8_inheritance.level_3_junior.task_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PetrolCar extends Car {

    private double petrolTankCapacity;

    void accelerate() {
        petrolTankCapacity--;
    }
}
