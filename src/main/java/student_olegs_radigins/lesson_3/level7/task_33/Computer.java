package student_olegs_radigins.lesson_3.level7.task_33;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Computer {
    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    String getManufacturer() {
        return manufacturer;
    }

    String getModel() {
        return model;
    }
}
