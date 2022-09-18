package student_eduard_minajev.lesson_8_inheritance.level_4_junior.task_14;

public class SquareTest {

    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.shouldGive25Area();
        test.shouldGive20Perimeter();
    }



    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    Square square1 = new Square("Borg Cube", 5);

    public void shouldGive25Area () {
        double testArea = square1.calculateArea();
        checkTestResult(testArea == 25, "shouldGive25Area");
    }

    public void shouldGive20Perimeter () {
        double testPerimeter = square1.calculatePerimeter();
        checkTestResult(testPerimeter == 20, "shouldGive20Perimeter");
    }
}
