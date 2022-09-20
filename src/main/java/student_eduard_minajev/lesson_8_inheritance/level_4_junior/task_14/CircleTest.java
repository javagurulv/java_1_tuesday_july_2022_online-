package student_eduard_minajev.lesson_8_inheritance.level_4_junior.task_14;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_8_inheritance/codereview/CleanCodeWarning_2.txt")
public class CircleTest {

    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.shouldGive314Area();
        test.shouldGive31Point4Perimeter();
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    Circle circle1 = new Circle("It's not a moon!",10);
    Circle circle2 = new Circle("Death Star",5);
    public void shouldGive314Area () {
        double testArea = circle1.calculateArea();
        checkTestResult(testArea == 314, "shouldGive314Area");
    }

    public void shouldGive31Point4Perimeter () {
        double testPerimeter = circle2.calculatePerimeter();
        double roundedPerimeterValue = (Math.round(testPerimeter));
        checkTestResult(roundedPerimeterValue == 31, "shouldGive31Point4Perimeter");
    }

}
