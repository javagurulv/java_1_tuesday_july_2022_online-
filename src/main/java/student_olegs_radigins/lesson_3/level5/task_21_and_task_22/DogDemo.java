package student_olegs_radigins.lesson_3.level5.task_21_and_task_22;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Sharik", 5, "Black");
        dog.dogVoice();
        dog.changeColor("Yellow");
        dog.dogVoice();
    }
}
