package student_ernest_aleskevics.lesson_7.homework;

class Coin {

    private int denomination;
    private String title;

    public Coin(int denomination, String title) {
        this.denomination = denomination;
        this.title = title;
    }

    int getDenomination(){
        return this.denomination;
    }

    String getTitle(){
        return this.title;
    }


}
