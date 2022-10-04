package student_levs_blinnikovs.lesson_8_inheritance.level_4_5.task_14_28;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RectangleTest {

    void shouldCalculateArea() {
        double expectedArea = 8;
        double realArea = new Rectangle(4, 2).calculateArea();
        testResultPrinter(expectedArea == realArea);
    }

    void shouldCalculatePerimeter() {
        double expectedPerimeter = 12;
        double realPerimeter = new Rectangle(4, 2).calculatePerimeter();
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

        RectangleTest test = new RectangleTest();

        test.shouldCalculateArea();
        test.shouldCalculatePerimeter();

    }

}
