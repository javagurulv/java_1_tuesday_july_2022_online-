package student_andrei_kholiavskii.lesson_3_oop_first_look.level_1_intern;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
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
