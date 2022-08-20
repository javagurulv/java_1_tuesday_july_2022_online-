package student_andrei_kholiavskii.lesson_3_oop_first_look.level_5_middle.task_21;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Dog {

    String dogName;
    int dogAge;

    String dogColour;

    Dog(String dogName, int dogAge, String dogColour) {

        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColour = dogColour;}
    void voice() {

        System.out.println(dogName + " " + dogAge + " " + dogColour);}


}
