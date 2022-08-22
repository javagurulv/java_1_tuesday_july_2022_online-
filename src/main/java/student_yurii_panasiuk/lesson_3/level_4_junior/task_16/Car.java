package student_yurii_panasiuk.lesson_3.level_4_junior.task_16;

class Car {

    String carmodel;

    Car(String carmodel) {
        this.carmodel = carmodel;
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

