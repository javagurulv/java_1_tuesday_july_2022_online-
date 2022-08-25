package student_sobit_eshniyozov.lesson_3_oop_first_look.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);
        circle1.calculateArea();
        circle2.calculateArea();
    }
}
