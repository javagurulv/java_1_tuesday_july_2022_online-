package student_olegs_radigins.lesson_8.level_3.task_12;

class BikeGiant extends Bicycle{
    private boolean hardTail;

    public BikeGiant(int numberOfGears, int frameSize, int wheelSize, boolean hardTail) {
        super(numberOfGears, frameSize, wheelSize);
        this.hardTail = hardTail;
    }

}