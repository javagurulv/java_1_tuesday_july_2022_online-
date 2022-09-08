package student_ivan_mostepanov.lesson_3_oop_first_look.robot;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Robot {

    String name;

    Robot(String name) {
        this.name = name;
    }

    void sayHello(){
        System.out.println("Hello");
    }

    void sayYourName(){
        System.out.println("My name is " + this.name);
    }


}
