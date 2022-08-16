package student_andrei_kholiavskii.lesson_3_oop_first_look.level_1_intern;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Методы не пиши в одну строку!")
class Robot {
     String name;


    Robot(String robotName) {

        this.name = robotName;
	}

    public void sayHello() {

        System.out.println("Hello!");
    }

    public void sayYourName() {
		System.out.println("My name is " + this.name);
	}

}
