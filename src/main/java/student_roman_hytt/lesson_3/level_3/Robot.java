package student_roman_hytt.lesson_3.level_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Robot {

    String name;
    Robot( String name){
        this.name=name;

    }
    void sayYourName (){
        System.out.println("My name is"+ this.name);
    }
}
