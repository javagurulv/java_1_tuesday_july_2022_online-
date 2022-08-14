package student_yurii_panasiuk.lesson_3.level_4.task_16;

class Car {

    String carmodel;
    String newModel;

    Car(String newModel) {
        this.carmodel = newModel;
    }

    String getModel() {
        return this.carmodel;
    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}

