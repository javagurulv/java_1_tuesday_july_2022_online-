package student_olegs_radigins.lesson_8.level_4_5;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class Triangle extends Shape {
    private double sideA;
    private final double sideB = sideA;
    private final double sideC = sideB;

    public Triangle(String title, double sideA) {
        super(title);
        this.sideA = sideA;
    }

    @Override
    double calculateArea() {
        return Math.sqrt(3) * sideA *sideA /4;
    }

    @Override
    double calculatePerimeter() {
        return sideA * 3;
    }
}
