package student_olegs_radigins.lesson_8.level_4_5;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_8_inheritance/codereview/CleanCodeWarning_5.txt")
class Circle extends Shape {
    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius *radius;
    }

    double calculatePerimeter() {
        return 2 * radius *Math.PI ;
    }

}
