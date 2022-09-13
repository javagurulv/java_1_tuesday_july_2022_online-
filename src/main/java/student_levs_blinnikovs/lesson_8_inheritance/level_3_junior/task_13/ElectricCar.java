package student_levs_blinnikovs.lesson_8_inheritance.level_3_junior.task_13;

class ElectricCar extends Car {

    private int batteryCharge;

    @Override
    void accelerate() {
        batteryCharge--;
    }
}
