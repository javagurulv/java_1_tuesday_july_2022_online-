package student_jelena_voinica.lesson_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Car {
    String carmodel;

    Car(String carmodel){
        this.carmodel = carmodel;
    }
    String getModel(){
        return this.carmodel;
    }
}


 class CarDemo{

    public static void main(String[]args){
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();

        System.out.println("Car model = " + carModel);
    }
 }