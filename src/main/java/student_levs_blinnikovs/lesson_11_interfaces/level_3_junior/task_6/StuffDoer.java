package student_levs_blinnikovs.lesson_11_interfaces.level_3_junior.task_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class StuffDoer implements MyFunctionalInterface {

    @Override
    public void doStuff() {
        System.out.println("I'm a real object!");
    }

}
