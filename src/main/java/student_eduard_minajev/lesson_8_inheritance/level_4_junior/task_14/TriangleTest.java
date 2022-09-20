package student_eduard_minajev.lesson_8_inheritance.level_4_junior.task_14;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TriangleTest {

    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.shouldGiveArea7();
        test.shouldGivePerimeter12();
    }

    Triangle triangle1 = new Triangle("Triangle", 4);

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    public void shouldGiveArea7 () {
        double testArea = triangle1.calculateArea();
        double roundedPerimeterValue = (Math.ceil(testArea));
        checkTestResult(roundedPerimeterValue == 7, "shouldGiveArea7");
    }

    public void shouldGivePerimeter12 () {
        double testPerimeter = triangle1.calculatePerimeter();
        checkTestResult(testPerimeter == 12, "shouldGivePerimeter12");
    }

}
