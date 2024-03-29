package student_levs_blinnikovs.lesson_8_inheritance.level_4_5.task_14_28;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TriangleTest {

    void shouldCalculateArea() {
        double expectedArea = 1.7320508075688772;
        double realArea = new Triangle(2).calculateArea();
        testResultPrinter(expectedArea == realArea);
    }

    void shouldCalculatePerimeter() {
        double expectedPerimeter = 6;
        double realPerimeter = new Triangle(2).calculatePerimeter();
        testResultPrinter(expectedPerimeter == realPerimeter);
    }

    void testResultPrinter(boolean isTestOK) {
        if (isTestOK) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test NOT OK!");
        }
    }

    public static void main(String[] args) {

        TriangleTest test = new TriangleTest();

        test.shouldCalculateArea();
        test.shouldCalculatePerimeter();

    }

}
