package student_levs_blinnikovs.lesson_3_oop_first_look.level_4_junior.task_16;

/*
Найти ошибку в коде.
        Исправить и запустить программу.
        Менять можно только класс Car.
 */

class Car {

    String model;

    Car(String newModel) {
        this.model = newModel;
    }

    String getModel() { // argument scope missing
        return this.model; // missing ;
    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}