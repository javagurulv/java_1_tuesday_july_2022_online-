package student_levs_blinnikovs.lesson_3_oop_first_look.level_5_middle.task_18_to_22;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DogDemo {

    public static void main(String[] args) {

        Dog mutt = new Dog("Rex", 5, "black");
        mutt.voice();

        mutt.happyBirthday();
        mutt.voice(); // Task 20;

        mutt.changeColor("yellow");
        mutt.voice();

    }

}

