package student_levs_blinnikovs.lesson_8_inheritance.level_4_5.task_14_28;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_8_inheritance/codereview/CleanCodeWarning_5.txt")
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
