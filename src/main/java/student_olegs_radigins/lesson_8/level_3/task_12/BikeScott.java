package student_olegs_radigins.lesson_8.level_3.task_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BikeScott extends Bicycle{
    private boolean fullSuspension;

    public BikeScott(int numberOfGears, int frameSize, int wheelSize, boolean fullSuspension) {
        super(numberOfGears, frameSize, wheelSize);
        this.fullSuspension = fullSuspension;
    }

}
