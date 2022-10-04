package student_levs_blinnikovs.lesson_9_objects_equality.level_3_junior.task_16;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        super();                                // вызов супер конструктора должен быть первым
        System.out.println(1);
        System.out.println(2);
    }
}
