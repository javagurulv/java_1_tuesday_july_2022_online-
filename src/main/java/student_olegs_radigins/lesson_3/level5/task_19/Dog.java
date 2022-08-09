package student_olegs_radigins.lesson_3.level5.task_19;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Dog {
    String dogName;
    int dogAge;

    Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    int getDogAge() {
        return dogAge;
    }

    void dogVoice() {
        System.out.println("Dog's name: " + dogName + ", age: " + dogAge);
    }

}
