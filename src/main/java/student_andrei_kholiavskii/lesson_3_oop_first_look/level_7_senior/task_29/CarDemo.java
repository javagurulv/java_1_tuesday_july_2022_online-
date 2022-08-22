package student_andrei_kholiavskii.lesson_3_oop_first_look.level_7_senior.task_29;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CarDemo {

    public static void main(String[] args){

        Car myFirstCar = new Car("Audi", "Coupe", 2.0, "dark blue");
        myFirstCar.carSpecs();
        myFirstCar.changeEngine(2.8);
        myFirstCar.carSpecs();

        Car mySecondCar = new Car("Volvo", "XC70", 2.4, "black");
        mySecondCar.carSpecs();
        mySecondCar.changeEngine(3.0);
        mySecondCar.carSpecs();
    }
}
