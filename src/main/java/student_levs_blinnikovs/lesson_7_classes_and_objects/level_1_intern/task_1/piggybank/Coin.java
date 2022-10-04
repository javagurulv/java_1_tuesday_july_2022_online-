package student_levs_blinnikovs.lesson_7_classes_and_objects.level_1_intern.task_1.piggybank;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Coin {

    private int denomination;
    private String title;

    public Coin(int denomination, String title) {
        this.denomination = denomination;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getDenomination() {
        return denomination;
    }

}
