package student_sobit_eshniyozov.lesson_3_oop_first_look.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Phone {
    String model;
        Phone (String newModel) {
            this.model = newModel;
        }
        String getModel() {
            return this.model;
        }

    }
