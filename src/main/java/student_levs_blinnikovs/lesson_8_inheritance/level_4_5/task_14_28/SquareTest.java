package student_levs_blinnikovs.lesson_8_inheritance.level_4_5.task_14_28;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SquareTest {

    void shouldCalculateArea() {
        double expectedArea = 4;
        double realArea = new Square(2).calculateArea();
        testResultPrinter(expectedArea == realArea);
    }

    void shouldCalculatePerimeter() {
        double expectedPerimeter = 8;
        double realPerimeter = new Square(2).calculatePerimeter();
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

        SquareTest test = new SquareTest();

        test.shouldCalculateArea();
        test.shouldCalculatePerimeter();

    }

}
