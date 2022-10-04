package student_levs_blinnikovs.lesson_8_inheritance.level_4_5.task_14_28;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Triangle extends Shape {

    private double side;

    Triangle(double side) {
        super("Triangle");
        this.side = side;
    }

    double calculateArea() {
        return (Math.sqrt(3) / 4) * Math.pow(side, 2);
    }

    double calculatePerimeter() {
        return 3 * side;
    }
}
