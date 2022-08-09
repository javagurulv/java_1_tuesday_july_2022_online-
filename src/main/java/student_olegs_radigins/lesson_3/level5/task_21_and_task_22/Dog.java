package student_olegs_radigins.lesson_3.level5.task_21_and_task_22;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class Dog {
    String dogName;
    int dogAge;

	@CodeReviewComment(teacher = "Why this class property public?")
   String dogColor;

    Dog(String dogName, int dogAge, String dogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }

    void dogVoice() {
        System.out.println("Dog's name: " + dogName + ", age: " + dogAge + ", color: " + dogColor);
    }

    void changeColor(String newColor) {
        dogColor = newColor;
    }


}
