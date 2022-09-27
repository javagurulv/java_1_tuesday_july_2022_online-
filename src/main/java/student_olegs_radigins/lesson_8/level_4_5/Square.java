package student_olegs_radigins.lesson_8.level_4_5;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_8_inheritance/codereview/CleanCodeWarning_5.txt")
class Square extends Shape{
    private double side;

    public Square(String title, double side) {
        super(title);
        this.side = side;
    }

    double calculateArea() {
        return side * side;
    }

    double calculatePerimeter() {
        return side * 4;
    }
}
