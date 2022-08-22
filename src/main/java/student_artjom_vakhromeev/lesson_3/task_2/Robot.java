package student_artjom_vakhromeev.lesson_3.task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Robot {

    String name ;

    public Robot(String name) {
        this.name = name;
    }
    void sayHello() {
        System.out.println("Hello!");
    }

    void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}