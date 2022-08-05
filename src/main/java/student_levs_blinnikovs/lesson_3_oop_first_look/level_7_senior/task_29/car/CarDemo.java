package student_levs_blinnikovs.lesson_3_oop_first_look.level_7_senior.task_29.car;
import static student_levs_blinnikovs.lesson_3_oop_first_look.level_7_senior.task_29.car.CarManufacturer.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CarDemo {
    public static void main(String[] args) {

        Car beamer = new Car(BMW, "330i", 2006, "black");
        beamer.display();

        beamer.paint("red");
        beamer.display();

        beamer.paint("yellow");
        beamer.display();

    }
}
