package student_olegs_radigins.lesson_3.level7.task_30;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        circle1.calculateArea();
        circle1.printCalculatedArea();

        Circle circle2 = new Circle(5.5);
        circle2.calculateArea();
        circle2.printCalculatedArea();

    }
}
