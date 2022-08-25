package student_sobit_eshniyozov.lesson_3_oop_first_look.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CarDemo{

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }
}