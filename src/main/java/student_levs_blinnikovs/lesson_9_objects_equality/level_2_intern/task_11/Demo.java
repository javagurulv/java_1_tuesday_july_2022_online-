package student_levs_blinnikovs.lesson_9_objects_equality.level_2_intern.task_11;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Demo {
    public static void main(String[] args) {

        int weight = 300;
        String[] toppings = {"cheese", "ham"};

        Pizza pizza = new Pizza(weight, toppings);

    }
}
