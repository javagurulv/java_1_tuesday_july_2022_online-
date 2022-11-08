package student_ivan_mostepanov.lesson_7_classes_and_objects;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Coin {
    private  int denomination;
    private String title;

    public Coin(int denomination, String title){
        this.denomination = denomination;
        this.title = title;

    }
        int getDenomination(){
        return this.denomination;
    }
        String getTitle(){
        return title;
    }



}
