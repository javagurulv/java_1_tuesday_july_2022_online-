package student_levs_blinnikovs.lesson_8_inheritance.level_2_intern.task_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Porsche911 extends Car {

    private int topSpeed;

    Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }

}