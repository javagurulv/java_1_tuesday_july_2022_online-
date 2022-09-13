package student_levs_blinnikovs.lesson_8_inheritance.level_3_junior.task_13;

class PetrolCar extends Car {

    private double petrolTankCapacity;

    @Override
    void accelerate() {
        petrolTankCapacity--;
    }
}
