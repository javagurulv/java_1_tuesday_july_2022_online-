package student_levs_blinnikovs.lesson_9_objects_equality.level_2_intern.task_11;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Pizza extends Food {

    String[] toppings;

    Pizza(int weight, String[] toppings) {
        super(weight);
        this.toppings = toppings;
    }

}
