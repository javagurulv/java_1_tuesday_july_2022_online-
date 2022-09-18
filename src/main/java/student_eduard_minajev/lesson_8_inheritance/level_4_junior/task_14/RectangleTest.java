package student_eduard_minajev.lesson_8_inheritance.level_4_junior.task_14;

public class RectangleTest {

    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.shouldGive30Area();
        test.shouldGive22Perimeter();
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    Rectangle rectangle1 = new Rectangle("Field",5,6);


    public void shouldGive30Area () {
        double testArea = rectangle1.calculateArea();
        checkTestResult(testArea == 30, "shouldGive30Area");
    }

    public void shouldGive22Perimeter () {
        double testPerimeter = rectangle1.calculatePerimeter();
        double roundedPerimeterValue = (Math.round(testPerimeter));
        checkTestResult(roundedPerimeterValue == 22, "shouldGive22Perimeter");
    }

}
