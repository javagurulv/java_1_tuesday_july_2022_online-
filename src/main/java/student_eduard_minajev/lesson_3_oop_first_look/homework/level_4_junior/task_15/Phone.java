package student_eduard_minajev.lesson_3_oop_first_look.homework.level_4_junior.task_15;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Phone {
    String model;

        Phone (String newModel) {
            this.model = newModel;
        }

        String getModel() {
            return this.model;
        }
}
