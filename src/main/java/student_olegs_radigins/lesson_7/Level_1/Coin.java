package student_olegs_radigins.lesson_7.Level_1;

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
