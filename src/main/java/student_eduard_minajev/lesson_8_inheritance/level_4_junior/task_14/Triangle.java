package student_eduard_minajev.lesson_8_inheritance.level_4_junior.task_14;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
public class Triangle extends Shape {

    private double sideLength;

    public Triangle (String title, double sideLength) {
        super(title);
        this.sideLength = sideLength;
    }

	@CodeReviewComment(teacher = "В этом методе не должно быть вывода на консоль!")
	@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_8_inheritance/codereview/CleanCodeWarning_3.txt")
	public double calculateArea() {
        double area =((Math.sqrt (3) * (Math.pow(sideLength, 2)))/4);
        System.out.println("Area of this triangle is : " + area);
        return area;
    }

	@CodeReviewComment(teacher = "В этом методе не должно быть вывода на консоль!")
	@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_8_inheritance/codereview/CleanCodeWarning_3.txt")
	public double calculatePerimeter() {
        double perimeter = sideLength * 3;
        System.out.println("Perimeter of this triangle is : " + perimeter);
        return perimeter;
    }

}
