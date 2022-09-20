package student_eduard_minajev.lesson_8_inheritance.level_4_junior.task_14;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
public class Rectangle extends Shape {

    private double lengthSize;

    private double widthSize;

    public Rectangle (String title, double lengthSize, double widthSize) {
        super(title);
        this.lengthSize = lengthSize;
        this.widthSize = widthSize;
    }

	@CodeReviewComment(teacher = "В этом методе не должно быть вывода на консоль!")
	@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_8_inheritance/codereview/CleanCodeWarning_3.txt")
    public double calculateArea() {
        double area = (lengthSize * widthSize);
        System.out.println("Area of this figure is : " + area);
        return area;
    }

	@CodeReviewComment(teacher = "В этом методе не должно быть вывода на консоль!")
	@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_8_inheritance/codereview/CleanCodeWarning_3.txt")
    public double calculatePerimeter() {
        double perimeter = ((lengthSize * 2) + (widthSize * 2));
        System.out.println("Perimeter of this figure is : " + perimeter);
        return perimeter;
    }
}
