package student_levs_blinnikovs.lesson_9_objects_equality.level_1_intern.task_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe();
        System.out.println(safe.password);
        safe.money--;

    }

}
