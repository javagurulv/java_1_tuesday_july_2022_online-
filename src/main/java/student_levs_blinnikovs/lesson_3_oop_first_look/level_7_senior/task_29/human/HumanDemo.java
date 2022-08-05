package student_levs_blinnikovs.lesson_3_oop_first_look.level_7_senior.task_29.human;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class HumanDemo {

    public static void main(String[] args) {

        Human randomHuman = new Human("John", "Smith", 29);

        randomHuman.greet();
        randomHuman.employ("factory");
        randomHuman.greet();

        randomHuman.layoff();
        randomHuman.greet();

        randomHuman.changeIdentity("Al", "Capone", 65);

        randomHuman.greetWithfakeName("Frank");

    }

}
