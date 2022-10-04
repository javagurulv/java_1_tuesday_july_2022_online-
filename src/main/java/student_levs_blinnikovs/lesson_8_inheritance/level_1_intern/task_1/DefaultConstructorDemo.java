package student_levs_blinnikovs.lesson_8_inheritance.level_1_intern.task_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DefaultConstructorDemo {
    public static void main(String[] args) {

        DefaultConstructor defaultConstructor = new DefaultConstructor();

        System.out.println(defaultConstructor.intExample == 0);
        System.out.println(defaultConstructor.doubleExample == 0.0);

    }
}
