package student_yurii_panasiuk.lesson_3.level_4_junior.task_16;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class Car {

    String carmodel;

	@CodeReviewComment(teacher = "Зачем это свойство?")
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

