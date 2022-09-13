package student_levs_blinnikovs.lesson_8_inheritance.level_4_junior.task_14_19;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    double calculateArea() {  // why Idea adds @Override? And why it works without it?
        return PI * pow(radius, 2);
    }

    double calculatePerimeter() {
        return 2 * PI * radius;
    }

}
