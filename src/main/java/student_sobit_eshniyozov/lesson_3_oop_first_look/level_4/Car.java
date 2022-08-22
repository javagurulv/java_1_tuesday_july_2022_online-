package student_sobit_eshniyozov.lesson_3_oop_first_look.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Car {
    String model;
    Car(String newModel) {
        this.model = newModel;
    }
    String getModel() {
        return this.model;
    }
}
