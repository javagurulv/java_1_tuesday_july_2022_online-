package student_ernest_aleskevics.lesson_8.level_3.task_13;

class ElectricCar extends Car {

    private int batteryCharge;

    void accelerate(){
        batteryCharge --;
        System.out.println(batteryCharge);

    }
}
