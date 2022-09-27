package student_olegs_radigins.lesson_8.level_2.task_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Porsche911 extends  Car{
    private int topSpeed;
    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }
}
