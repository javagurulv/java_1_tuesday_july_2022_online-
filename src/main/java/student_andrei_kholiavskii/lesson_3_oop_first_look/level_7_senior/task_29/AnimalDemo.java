package student_andrei_kholiavskii.lesson_3_oop_first_look.level_7_senior.task_29;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AnimalDemo {

    public static void main(String[] args) {

        Animal bird = new Animal("Nightingale", 1, "eastern Europe");
        bird.animalInfo();
        bird.changeHabitat("Africa");
        bird.animalInfo(); }
}
