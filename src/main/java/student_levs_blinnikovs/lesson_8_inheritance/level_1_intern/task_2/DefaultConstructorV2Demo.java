package student_levs_blinnikovs.lesson_8_inheritance.level_1_intern.task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DefaultConstructorV2Demo {
    public static void main(String[] args) {

        DefaultConstructorV2 defaultConstructorV2 = new DefaultConstructorV2();

        System.out.println(defaultConstructorV2.intExample == 0);
        System.out.println(defaultConstructorV2.doubleExample == 0.0);

    }
}
