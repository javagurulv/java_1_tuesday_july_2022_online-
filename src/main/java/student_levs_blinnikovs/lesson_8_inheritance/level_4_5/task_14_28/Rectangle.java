package student_levs_blinnikovs.lesson_8_inheritance.level_4_5.task_14_28;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Rectangle extends Shape {   // по сути-то Square extends Rectangle ;)

    private double sideOne;
    private double sideTwo;

    Rectangle(double sideOne, double sideTwo) {
        super("Rectangle");
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    double calculateArea() {
        return sideOne * sideTwo;
    }

    double calculatePerimeter() {
        return 2 * (sideOne + sideTwo);
    }
}
