package student_olegs_radigins.lesson_8.level_4_5;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_8_inheritance/codereview/CleanCodeWarning_5.txt")
class Rectangle extends Shape {
    double sideA;
    double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    double calculateArea() {
        return sideA * sideB;
    }

    double calculatePerimeter() {
        return (sideA + sideB) * 2;
    }
}
