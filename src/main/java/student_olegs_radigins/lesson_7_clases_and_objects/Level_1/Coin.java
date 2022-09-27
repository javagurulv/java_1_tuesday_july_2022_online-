package student_olegs_radigins.lesson_7_clases_and_objects.Level_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Coin {
    private int denomination;
    private String title;

    public Coin(int denomination, String title) {
        this.denomination = denomination;
        this.title = title;
    }

    public int getDenomination() {
        return denomination;
    }

    public String getTitle() {
        return title;
    }
}
