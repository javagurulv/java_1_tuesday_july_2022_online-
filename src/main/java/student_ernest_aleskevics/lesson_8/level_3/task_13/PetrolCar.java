package student_ernest_aleskevics.lesson_8.level_3.task_13;

class PetrolCar extends Car {

    private double petrolTankCapacity;

    void accelerate(){
        petrolTankCapacity -- ; // если написать petrolTankCapacity = -- petrolTankCapacity, будет тоже правильно?
        System.out.println(petrolTankCapacity);
    }
}
