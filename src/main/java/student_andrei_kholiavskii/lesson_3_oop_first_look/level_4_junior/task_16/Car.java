package student_andrei_kholiavskii.lesson_3_oop_first_look.level_4_junior.task_16;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Car {

    String carModel;

    Car(String newModel) {
        this.carModel = newModel;
    }

    String getModel() {
        return this.carModel;
    }

}
