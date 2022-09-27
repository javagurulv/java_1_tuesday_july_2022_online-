package student_olegs_radigins.lesson_8.level_3.task_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class Bicycle {
    private int numberOfGears;
    private int frameSize;
    private int wheelSize;

    public Bicycle(int numberOfGears, int frameSize, int wheelSize) {
        this.numberOfGears = numberOfGears;
        this.frameSize = frameSize;
        this.wheelSize = wheelSize;
    }

}
