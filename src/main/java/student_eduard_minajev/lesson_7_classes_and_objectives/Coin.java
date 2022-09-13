package student_eduard_minajev.lesson_7_classes_and_objectives;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Coin {

    private int denomination;
    private String title;

    public Coin(int denomination, String title) {
        this.denomination = denomination;
        this.title = title;
    }

    public int getDenomination() {
        return denomination;
    }

    public String getTitle () {
        return title;
    }


    public int setDenomination (int newDenomination){
        if (newDenomination == 1 || newDenomination == 2 || newDenomination == 5 || newDenomination == 10 || newDenomination == 20 || newDenomination == 50 ) {
            this.denomination = newDenomination;
        }
        return this.denomination;
    }

    public String setTitle (String newTitle){
        if (denomination == 1 || denomination == 2 && newTitle == "Euro" ){

        } else if (denomination == 1 || denomination == 2 || denomination == 5 || denomination == 10 || denomination == 20 || denomination == 50 && newTitle == "Cent") {
        }
        this.title = newTitle;
        return newTitle;
    }
}
