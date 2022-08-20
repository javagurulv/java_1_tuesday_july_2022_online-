package student_andrei_kholiavskii.lesson_3_oop_first_look.level_7_senior.task_29;

class Car {
    String carBrand;
    String carModel;
    double carEngineCapacity;
    String carColor;

    Car (String carBrand, String carModel, double carEngineCapacity, String carColor){
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carEngineCapacity = carEngineCapacity;
        this.carColor = carColor;}

    void carSpecs(){
        System.out.println("This car is " + carBrand +" " + carModel + ". It has " + carEngineCapacity + " liter engine. Cars color is " + carColor + ".");}

    void changeEngine(double carEngineCapacity){
        this.carEngineCapacity = carEngineCapacity;
        System.out.println("Car engine was replaced with " + this.carEngineCapacity + " liter engine.");
    }

}